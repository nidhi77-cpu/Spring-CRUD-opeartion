/**
 * 
 */
package com.example.Testspring.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.Testspring.controllers.Departmentcontroller;
import com.example.Testspring.entity.Department;
import com.example.Testspring.services.DepartmentService;
import com.mysql.cj.x.protobuf.MysqlxResultset.ContentType_BYTES;

/**
 * @author srinidhi.k
 *
 */

@WebMvcTest(Departmentcontroller.class)
public class DepartmentControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private DepartmentService departmentService;
	
	private Department department;
	@BeforeEach
	 void setup()
	{
		Department dept = Department.builder()
				.deptaddress("vakrahalli")
				.deptid(1L)
				.deptname("IT")
				.deptcode("supercode")
				.build();
	}

	@Test
	 void savedept() throws Exception
	{
		Department inputdept = Department.builder()
				.deptaddress("vakrahalli")
				
				.deptname("IT")
				.deptcode("supercode")
				.build();
		
		Mockito.when(departmentService.savedeaprtment(inputdept))
		.thenReturn(department);
		
		
		mockMvc.perform(MockMvcRequestBuilders.post("/department")
			.contentType(MediaType.APPLICATION_JSON)
			.content("{\r\n"
					+ "\r\n"
					+ "	\"deptname\" : \"IT\",\r\n"
					+ "	\"deptaddress\" : \"vakrahalli\" ,\r\n"
					+ "	\r\n"
					+ "	\"deptcode\" : \"supercode\" \r\n"
					+ "	\r\n"
					+ "	\r\n"
					+ "	\r\n"
					+ "	\r\n"
					+ "}"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	 void fetchdeptById()
	{
		
	}
}
