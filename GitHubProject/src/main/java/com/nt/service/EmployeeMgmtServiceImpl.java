package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	
	@Autowired
	private IEmployeeRepository empRepo;
	
	
	@Override
	public String registerEmployee(Employee emp) {
		
		return null;
	}

	@Override
	public String employeeById(int id) {
		
		return null;
	}

}
