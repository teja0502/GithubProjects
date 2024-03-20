package com.nt.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	
	private Integer empNo;
	
	private String empName;
	
	private String addrs;

}
