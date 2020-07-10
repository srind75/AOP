package com.examples.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.after.advice.beans.Student;
import com.examples.after.advice.bo.InstituteService;
import com.examples.throwsadvice.beans.Movie;
import com.examples.throwsadvice.bo.MovieService;

public class Test_Throw_Advice {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/examples/resources/ApplicationContextThrowsAdvice.xml");
		Movie movie = (Movie)context.getBean("movieBean");
		MovieService movie_Service = (MovieService) context.getBean("proxy");
		try { 
			movie_Service.playMovie(movie); 
			} catch (Exception e) { 
				 }
		

	}

}
