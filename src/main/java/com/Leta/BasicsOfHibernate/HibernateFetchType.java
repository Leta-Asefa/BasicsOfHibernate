package com.Leta.BasicsOfHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Leta.ClassDesigns.Car;
import com.Leta.ClassDesigns.Department;
import com.Leta.ClassDesigns.Driver;
import com.Leta.ClassDesigns.Learner;

public class HibernateFetchType {
	Session session=null;
	Learner learner=null;
	Department department=null;

	public HibernateFetchType() {
		
	
		Configuration config=new Configuration().configure();
		config.addAnnotatedClass(Department.class).addAnnotatedClass(Learner.class);
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory factory=config.buildSessionFactory(registry);
		 session=factory.openSession();
	
		 //addSomeDataToDB();
		 testFetchType();
		 displayLearner();

		//Lazy Fetching Mode : will fetch from the database only when a related entities are requested 
		//Eager Fetching Mode : will fetch the requested entity from the database  with its related entities
			
	
	
	}
	
	

	public void addSomeDataToDB() {
		
		Learner learner1= new Learner("4","Tola");
		Learner learner2= new Learner("5","Eframe");
		Learner learner3= new Learner("6","Sitotaw");
		
		Department department1= new Department("1","IT");
		Department department2= new Department("2","CS");
		Department department3= new Department("3","SE");
		
		learner1.setDepartment(department1);
		learner2.setDepartment(department1);
		learner3.setDepartment(department3);
		
	session.beginTransaction();
		
		session.save(learner1);
		session.save(learner2);
		session.save(learner3);
			
	session.getTransaction().commit();
	System.out.println("Commited  ! ");
	
	}

	
	private void testFetchType() {
		session.beginTransaction();
		
		department=(Department)session.get(Department.class, "1");
		
		session.getTransaction().commit();
		System.out.println("Fetched ! \n");
		
		
	}
	
	public void displayLearner() {
		System.out.println(department);
		
		System.out.println("\n Student in IT Department\n--------------------------------");
		//if the mode is Lazy : the query to fetch Learners will be displayed  here since it only fetch when it is requested
		//if it is eager since it already fetch it with the Department request no need to query again therefore no display....
		for (Learner  learner :department.getLearners() ) {
			System.out.println(learner.getName());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
