/**
 * 
 */
package com.example.Testspring.controllers;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Testspring.entity.Department;
import com.example.Testspring.repositry.DepartmentRepositry;

/**
 * @author srinidhi.k
 *
 */
@RestController
public class HelloController {
	
	
	@Value("${welcome.message}")
	private String welcomemessage;
	
	@GetMapping("/")
	public String helloworld()
	{
		return welcomemessage;
	}
	
	/*
	 * @Autowired DepartmentRepositry departmentRepositry;
	 * 
	 * @PostMapping public Department savedepartment( @Valid @RequestBody Department
	 * department) { return departmentRepositry.save(department); }
	 * 
	 * @GetMapping("/depts") public List<Department> fethcalldepartments() { return
	 * departmentRepositry.findAll(); }
	 * 
	 * @GetMapping("/depts/{id}") public Department
	 * getdepartbyId(@PathVariable("id") Long deptid) { Department dept =
	 * departmentRepositry.findById(deptid).get(); return dept;
	 * 
	 * }
	 * 
	 * @DeleteMapping("/depts/{id}") public String
	 * deletedepartbyId(@PathVariable("id") Long deptid) {
	 * 
	 * departmentRepositry.deleteById(deptid); return "string deleted sucessfullyy";
	 * }
	 * 
	 * @PutMapping public Department updatebydepartment(@PathVariable("id") Long
	 * deptid , @RequestBody Department department) { Department dbo =
	 * departmentRepositry.findById(deptid).get();
	 * if(Objects.nonNull(department.getDeptname()) &&
	 * !"".equalsIgnoreCase(department.getDeptname())) {
	 * dbo.setDeptname(department.getDeptname()); } return
	 * departmentRepositry.save(dbo); }
	 */
}
