package com.program;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.EProduct;


public class HibernateUtil {

	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(EProduct.class);
	
	
	
	SessionFactory sf = cfg.buildSessionFactory();

	return sf;
}
}
