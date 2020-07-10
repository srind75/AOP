package com.examples.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.beans.Show;
import com.examples.service.ShowService;

public class Test_Show {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"/com/examples/resources/applicationContextShow.xml");
		Show show = (Show) context.getBean("showBean");
		ShowService showService = (ShowService) context.getBean("showService");
		try {
			showService.runShow(show);
		} catch (RuntimeException e) {
			// System.out.println(e.getMessage());
		}

	}

}
