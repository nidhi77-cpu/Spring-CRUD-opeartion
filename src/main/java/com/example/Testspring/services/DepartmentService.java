package com.example.Testspring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Testspring.entity.Department;
import com.example.Testspring.error.DepartmentNotFound;
/**
 * @author srinidhi.k
 *
 */
@Service
public interface DepartmentService {

	public Department savedeaprtment(Department department);

	 public List<Department> fetchdepartmentlist();

	public Department fetchdepartmentById(Long deptid) throws DepartmentNotFound;

	public String deletedepartment(Long deptid);

	public Department updatedepartment(Long deptid, Department department);

	public Department fetchdepartmentbyname(String deptname);

//	 public Department fetchdepartmentbyname(String deptname);

	

}
