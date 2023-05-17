package com.example.Testspring.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Testspring.entity.Department;
/**
 * @author srinidhi.k
 *
 */
@Repository
public interface DepartmentRepositry  extends JpaRepository<Department, Long >

{

   public Department findBydeptname(String deptname);
}
