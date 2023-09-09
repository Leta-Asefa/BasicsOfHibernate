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

public class HibernateManyToMany {

	public HibernateManyToMany() {
		
		Car car1= new Car ("1","Ferray");
		Car car2= new Car ("2","Ford");
		Car car3= new Car ("3","Toyota");
		Car car4= new Car ("4","Suzuki");
		
		Driver driver1= new Driver ("1","Abebe");
		Driver driver2= new Driver ("2","Teka");
		Driver driver3= new Driver ("3","Biniyam");
		Driver driver4= new Driver ("4","Solomon");
		
		// Take the car as a reference 
		car1.getDrivers().add(driver1); // car 1 is driven by driver 1
		car2.getDrivers().add(driver1); // car 2 is driven by driver 1
		car2.getDrivers().add(driver2); // car 2 is driven by driver 2
		
		
		Configuration config=new Configuration().configure();
		config.addAnnotatedClass(Driver.class).addAnnotatedClass(Car.class);
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory factory=config.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(car1);
		session.save(car2);
		session.save(car3);
		session.save(car4);
		session.save(driver1);
		session.save(driver1);
		session.save(driver1);
		session.save(driver1);
		transaction.commit();
		
		
		System.out.println("Saved ! ");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
