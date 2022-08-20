package com.util;

import com.AllDetails.ClassDetails;
import com.AllDetails.StudentDetails;
import com.AllDetails.SubjectDetails;
import com.AllDetails.TeacherDetails;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
	private static SessionFactory factory;
	
	public static SessionFactory buildConnection() {
		
		factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(StudentDetails.class)	
				.addAnnotatedClass(TeacherDetails.class)
				.addAnnotatedClass(ClassDetails.class)
				.addAnnotatedClass(SubjectDetails.class)
				.buildSessionFactory();
		
		return factory;
	}
}
