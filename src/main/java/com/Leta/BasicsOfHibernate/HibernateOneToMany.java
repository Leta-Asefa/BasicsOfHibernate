package com.Leta.BasicsOfHibernate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Leta.ClassDesigns.Department;
import com.Leta.ClassDesigns.Developer;
import com.Leta.ClassDesigns.Laptop;
import com.Leta.ClassDesigns.Learner;

public class HibernateOneToMany {

	public HibernateOneToMany() {
		
		//if the foreign key column is null :-
		//use learner.setDepartment instead of using department.getLearners().add(learner)
		
		Learner learner1= new Learner("1","Abebe");
		Department department1=new Department("1","IT");
		
		Learner learner2= new Learner("2","Kebede");
		Department department2=new Department("2","CS");
		
		Learner learner3= new Learner("3","Teshome");
		Department department3=new Department("3","IS");
		
		learner1.setDepartment(department1);
		learner2.setDepartment(department1);
		learner3.setDepartment(department2);
		
	
	
		Configuration config=new Configuration().configure();
		config.addAnnotatedClass(Department.class).addAnnotatedClass(Learner.class);
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory factory=config.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(department1);
		session.save(learner1);
		session.save(department2);
		session.save(learner2);
		session.save(department3);
		session.save(learner3);
		
		transaction.commit();
		
		
		System.out.println("Saved ! ");
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
