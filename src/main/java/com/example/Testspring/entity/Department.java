package com.example.Testspring.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long deptid;
	@NotBlank(message ="Please add department name")
	private String deptname;
	private String deptaddress;
	private String deptcode;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(long deptid, String deptname, String deptaddress, String deptcode) {
		super();
		this.deptid =  deptid;
		this.deptname = deptname;
		this.deptaddress = deptaddress;
		this.deptcode = deptcode;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", deptname=" + deptname + ", deptaddress=" + deptaddress
				+ ", deptcode=" + deptcode + "]";
	}
	public Long getDeptid() {
		return deptid;
	}
	public void setDeptid(Long deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getDeptaddress() {
		return deptaddress;
	}
	public void setDeptaddress(String deptaddress) {
		this.deptaddress = deptaddress;
	}
	
	@NotBlank(message = "")
	
	public String getDeptcode() {
		return deptcode;
	}
	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}
	

}
