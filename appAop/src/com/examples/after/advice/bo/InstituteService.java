package com.examples.after.advice.bo;

import com.examples.after.advice.beans.Student;

public interface InstituteService {
	
	public void enquiry(Student std, String course_Name);
	public void registration(Student std, String course_name);

}
