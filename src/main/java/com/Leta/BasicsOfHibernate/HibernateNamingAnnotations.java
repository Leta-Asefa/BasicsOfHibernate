package com.Leta.BasicsOfHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Leta.ClassDesigns.Student;

public class HibernateNamingAnnotations {

	public HibernateNamingAnnotations() {
		
		Student student= new Student("1","Abebe","SE");
		
		Configuration config= new Configuration().configure(); 
    	config.addAnnotatedClass(Student.class);
    
    ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    
    	SessionFactory factory=config.buildSessionFactory(registry);
    	
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	session.save(student);
    	transaction.commit();
    	
    	
    	System.out.println("saved successfuly !");
	}

}
