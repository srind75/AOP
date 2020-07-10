package com.examples.after.advice.bo;

import com.examples.after.advice.beans.Student;

public class InstituteServiceImpl implements InstituteService {

	@Override
	public void enquiry(Student std, String course_Name) {
		System.out.println("Student Enquiry Details"); 
		System.out.println("-----------------------------"); 
		System.out.println("Student Name :"+std.getSname()); 
		System.out.println("Student Qualification :"+std.getSqual()); 
		System.out.println("Student Email ID :"+std.getSemail()); 
		System.out.println("Student Mobile NUmber :"+std.getSmobile());
		System.out.println("Enquiry Course Name :"+course_Name);
	}

	@Override
	public void registration(Student std, String course_name) {
		System.out.println("Student Course Registration Details"); 
		System.out.println("-------------------------------------"); 
		System.out.println("Student Name :"+std.getSname()); 
		System.out.println("Student Qualification :"+std.getSqual()); 
		System.out.println("Student Email ID :"+std.getSemail()); 
		System.out.println("Student Mobile NUmber :"+std.getSmobile()); 
		System.out.println("Enquiry Course Name :"+course_name);

	}

}
