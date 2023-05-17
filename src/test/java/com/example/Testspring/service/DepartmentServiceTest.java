package com.example.Testspring.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.Testspring.entity.Department;
import com.example.Testspring.repositry.DepartmentRepositry;
import com.example.Testspring.services.DepartmentService;
/**
 * @author srinidhi.k
 *
 */

@SpringBootTest
public class DepartmentServiceTest {

	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepositry departmentRepositry;
	@BeforeEach
	void setup()
	{
		Department dept = Department.builder()
				.deptaddress("vakrahalli")
				.deptid(1L)
				.deptname("IT")
				.deptcode("supercode")
				.build();
		
		Mockito.when(departmentRepositry.findBydeptname("IT")).thenReturn(dept);
	}
	
	@Test
	@DisplayName("Get a data based on valid department name")
	public void whenValidDepartmentName_thenDepartmentShouldFound()
	{
		String deptname ="IT";
		Department found = 
				departmentService.fetchdepartmentbyname(deptname);
		
		assertEquals(deptname,  found.getDeptname());
		
	}
	
}
