package com.Leta.BasicsOfHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Leta.ClassDesigns.Student;
import com.Leta.ClassDesigns.Teacher;
import com.Leta.ClassDesigns.User;

public class HIbernateConfiguration {

	public HIbernateConfiguration() {
		
		
		Student student=new Student("1","Hiwot","SE");
		Teacher teacher=new Teacher("1","Hiwot","SE");
		
    	
		//-----------Method 1---------------but the buildSessionFactory() is deprecated 
		
					//	    Configuration config=new Configuration().configure();
					//	    config.addAnnotatedClass(Student.class);
					//	    SessionFactory factory=config.buildSessionFactory();
					//	    Session session=factory.openSession();
					//	    Transaction transaction=session.beginTransaction();
					//	    session.save(student);
					//	    transaction.commit();
					//	    System.out.println("Saved !");
	    	
	    	
		
		//-----------Method 2--------------Solution for the deprecated method
	    	
	    	Configuration config= new Configuration().configure();  // comment 1
	    	config.addAnnotatedClass(User.class);	
	    	config.addAnnotatedClass(Teacher.class);
	    	config.addAnnotatedClass(Student.class);
	    
	    ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
	    
	    	SessionFactory factory=config.buildSessionFactory(registry);
	    	
	    	Session session=factory.openSession();
	    	Transaction transaction=session.beginTransaction();
	    	session.save(student);
	    	session.save(teacher);
	    	transaction.commit();
	    	
	    	
	    	System.out.println("saved successfuly !");
	    	
	    	
	  //comment 1:
	    //if the hibernate xml file is default use configure() without parameter if not configure("xmlFileName.xml");
	    
	    //if you use create in the xml configuration every time you run the program it will create new table ,destroy
	    //the existing data and save the current data only , 
	   //if you don't want this to happen you can set it update
	   // it will not create new table just it will update it and no loss of data 
	    //you can also set it to none to manage the database changes by your own
	    	
	    	
	    
	    // <property name="show_sql">true</property>
	    //this property will help you to show which query is executed in the console 
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	
	}

}
