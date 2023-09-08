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

import com.Leta.ClassDesigns.Car;
import com.Leta.ClassDesigns.Developer;
import com.Leta.ClassDesigns.Driver;
import com.Leta.ClassDesigns.Laptop;

public class HibernateOneToMany {

	public HibernateOneToMany() {
		
		
	Driver driver1=	new Driver("5","Abebe");
	Driver driver2=		new Driver("2","Hennary");
	Driver driver3=		new Driver("3","James");
	Driver driver4=	new Driver("4","Navin");
		
		Car car=new Car();
		car.setId("7");
		car.setName("Suzuki");
		car.getDrivers().add(driver1);
		car.getDrivers().add(driver2);
		car.getDrivers().add(driver3);
		car.getDrivers().add(driver4);
	
		Configuration config=new Configuration().configure();
		config.addAnnotatedClass(Driver.class).addAnnotatedClass(Car.class);
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory factory=config.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(car);
		session.save(driver1);
		session.save(driver2);
		session.save(driver3);
		session.save(driver4);
		transaction.commit();
		
		
		System.out.println("Saved ! ");
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
