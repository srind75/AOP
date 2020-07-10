package com.examples.before.advice.service;

import com.examples.before.advice.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void displayEmployee(Employee emp) {
		System.out.println("Employee Details from displayEmployee(---)"); 
        System.out.println("----------------------------------------------"); 
        System.out.println("Employee Number :"+emp.getEno()); 
        System.out.println("Employee Name :"+emp.getEname()); 
        System.out.println("Employee Salary :"+emp.getEsal()); 
        System.out.println("Employee Email Id :"+emp.getEemail()); 
        System.out.println("Employee Mobile No :"+emp.getEmobile());
		

	}

	@Override
	public void getEmployeeDetails(Employee emp) {

		System.out.println("Employee Details from getEmployeeDetails(--)"); 
		System.out.println("---------------------------------------------------"); 
		System.out.println("Employee Number :"+emp.getEno()); 
		System.out.println("Employee Name :"+emp.getEname()); 
		System.out.println("Employee Salary :"+emp.getEsal()); 
		System.out.println("Employee Email Id :"+emp.getEemail()); 
		System.out.println("Employee Mobile No :"+emp.getEmobile());
	}

}
