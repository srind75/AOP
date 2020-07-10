package com.examples.service;

import com.examples.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String createEmployee(Employee emp) throws Exception {
		System.out.println("Employee "+emp.getEno()+" Inserted Successfully from createEmployee()");
		return "Success";
	}

	@Override
	public Employee searchEmployee(int eno) {
		System.out.println("Employee "+eno+" Existed from serachEmployee()");
		return null;
	}

	@Override
	public String updateEmployee(Employee emp) {
		System.out.println("Employee "+emp.getEno()+" Updated Successfully from updateEmployee()");
		return "Success";
	}

	@Override
	public String deleteEmployee(Employee emp) {
		System.out.println("Employee "+emp.getEno()+" Deleted Successfully from deleteEmployee()");
		return null;
	}

}
