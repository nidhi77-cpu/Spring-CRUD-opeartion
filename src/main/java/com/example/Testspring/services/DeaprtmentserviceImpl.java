package com.example.Testspring.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Testspring.entity.Department;
import com.example.Testspring.error.DepartmentNotFound;
import com.example.Testspring.repositry.DepartmentRepositry;

@Service
public class DeaprtmentserviceImpl implements DepartmentService {

	
	
	@Autowired
	private DepartmentRepositry departmentRepositry;
	
	
	@Override
	public Department savedeaprtment(Department department) {
	  return departmentRepositry.save(department);	
	  
	 
	}


	@Override
	public List<Department> fetchdepartmentlist() {
		return departmentRepositry.findAll();
	}


	@Override
	public Department fetchdepartmentById(Long deptid) throws DepartmentNotFound {
		Optional<Department> dept = departmentRepositry.findById(deptid);
		if(!dept.isPresent())
		{
			throw new DepartmentNotFound("depart id not aviable");
		}
		return dept.get();
	}


	@Override
	public String deletedepartment(Long deptid) {
		
		departmentRepositry.deleteById(deptid);
		
		return "String deleted succesfulllyy";
	}


	@Override
	public Department updatedepartment(Long deptid, Department department) 
	{
		/*
		 * Department dbo = departmentRepositry.findById(deptid).get();
		 * 
		 * if(Objects.nonNull(department.getDeptname()) && !
		 * "".equalsIgnoreCase(department.getDeptname())) {
		 * dbo.setDeptname(department.getDeptname()); }
		 */
		
		Department dbo = departmentRepositry.findById(deptid).get();
		
		if(Objects.nonNull(department.getDeptname()) && !"".equalsIgnoreCase(department.getDeptname()))
		{
			dbo.setDeptname(department.getDeptname());
		}
		if(Objects.nonNull(department.getDeptaddress()) &&
				! "".equalsIgnoreCase(department.getDeptaddress()))
		{
			 dbo.setDeptaddress(department.getDeptname());
		}
		if(Objects.nonNull(department.getDeptcode()) &&
				! "".equalsIgnoreCase(department.getDeptcode()))
		{
			 dbo.setDeptcode(department.getDeptcode());
		}
		
		return departmentRepositry.save(dbo);
	}


	@Override
	public Department fetchdepartmentbyname(String deptname) {
		
		return departmentRepositry.findBydeptname(deptname);
	}




}
