package com.example.Testspring.controllers;

import java.util.List;

import javax.persistence.Id;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Testspring.entity.Department;
import com.example.Testspring.error.DepartmentNotFound;
import com.example.Testspring.repositry.DepartmentRepositry;
import com.example.Testspring.services.DepartmentService;
/**
 * @author srinidhi.k
 *
 */
@RestController
public class Departmentcontroller {
	
@Autowired
public DepartmentService departmentService;
	
	private final Logger LOGGER = 
			LoggerFactory.getLogger(Departmentcontroller.class);
	

	
	
	@PostMapping("/department")
	public Department savedeaprtment( @Valid @RequestBody Department department)
	{
		return departmentService.savedeaprtment(department);
		
	}
	
	@GetMapping("/department")
	public List<Department> fetchdepartmentlist()
	{
		return departmentService.fetchdepartmentlist();
	}
	
	@GetMapping("/department/{id}")
	public Department fetchdepartmentById(@PathVariable("id") Long deptid ) throws DepartmentNotFound
	{
		return departmentService.fetchdepartmentById(deptid);
	}
	
	@DeleteMapping("/department/{id}")
	public String deletedepartment(@PathVariable("id") Long deptid) {
		
		
		return departmentService.deletedepartment(deptid);
	}
	
	@PutMapping("/department/{id}")
	public Department updatedepartment(@PathVariable("id") Long deptid , @RequestBody Department department)
	{
		return departmentService.updatedepartment(deptid,department);
	}
	
	@GetMapping("/department/name/{name}")
	
	public Department fetchdepartmentbyname(@PathVariable("name") String deptname )
	{
		return departmentService.fetchdepartmentbyname(deptname);
	}
}
