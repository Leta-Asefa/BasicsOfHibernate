package com.Leta.BasicsOfHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Leta.ClassDesigns.Name;
import com.Leta.ClassDesigns.Student;
import com.Leta.ClassDesigns.Teacher;

public class HibernateEmbeddable {

	public HibernateEmbeddable() {
		
		Name name= new Name("Abebe","Kebede","Goshu");
	
		Teacher teacher= new Teacher("1",name,"IT");
		
		Configuration config= new Configuration().configure(); 
    	config.addAnnotatedClass(Teacher.class);
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory factory=config.buildSessionFactory(registry);
    	Session session=factory.openSession();
    	
    	Transaction transaction=session.beginTransaction();
    	session.save(teacher);
    	transaction.commit();
    	
    	
    	System.out.println("saved successfuly ! " );
    	
	
	}


	
	
	}


