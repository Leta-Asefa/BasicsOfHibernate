package com.Leta.BasicsOfHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Leta.ClassDesigns.Student;
import com.Leta.ClassDesigns.Teacher;

public class HibernateFetchingData {

	public HibernateFetchingData() {
		Student student= null;
		Teacher teacher=null;
		
		Configuration config= new Configuration().configure(); 
    	config.addAnnotatedClass(Student.class);
    	config.addAnnotatedClass(Teacher.class);
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory factory=config.buildSessionFactory(registry);
    	Session session=factory.openSession();
    	
    	Transaction transaction=session.beginTransaction();
    	
    	student=(Student) session.get(Student.class, "1");
    	teacher=(Teacher) session.get(Teacher.class, "1");
    	
    	transaction.commit();
    	
    	
    	
    	System.out.println("Fetched successfuly ! \n" + student.toString() );
    	System.out.println("Fetched successfuly ! \n" + teacher.toString() );
    	
	
	
	}

}
