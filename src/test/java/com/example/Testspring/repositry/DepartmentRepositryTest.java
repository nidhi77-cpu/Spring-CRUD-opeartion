/**
 * 
 */
package com.example.Testspring.repositry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.Testspring.entity.Department;

/**
 * @author srinidhi.k
 *
 */


@DataJpaTest
public class DepartmentRepositryTest {
	
	@Autowired
	private DepartmentRepositry departmentRepositry;
	
	@Autowired
	private TestEntityManager EntityManager;
	
	@BeforeEach
	public void setup()
	{
		Department dept = Department.builder()
				.deptaddress("raguvanhalli")
				.deptname("telecom")
				.deptid(1L)
				.deptcode("zero knowledge ")
				.build();
		
		EntityManager.persist(dept);
	}
	
	
	@Test
	@DisplayName("Get a data based on valid id ")
	public void  whenFindDeptById_thenReturnDept()
	{
		Department department = departmentRepositry.findById(1L).get();
		
		assertEquals(department.getDeptname() , "telecom" );
		
	}

}
