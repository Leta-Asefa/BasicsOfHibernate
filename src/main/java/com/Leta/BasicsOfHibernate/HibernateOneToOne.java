package com.Leta.BasicsOfHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Leta.ClassDesigns.Developer;
import com.Leta.ClassDesigns.Laptop;

public class HibernateOneToOne {

	public HibernateOneToOne() {
	
		Laptop lap_1=new Laptop("5","Tosiba");
//		Laptop lap_2=new Laptop("2","Hp");
//		Laptop lap_3=new Laptop("3","Asus");
//		Laptop lap_4=new Laptop("4","MacBook");
//		
		Developer dev_1=new Developer("4","Sisay",lap_1);
//		Developer dev_2=new Developer("2","Getachew",lap_2);
//		Developer dev_3=new Developer("3","Lema",lap_3);
//		
		
		
		Configuration config=new Configuration().configure();
		config.addAnnotatedClass(Laptop.class).addAnnotatedClass(Developer.class);
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory factory=config.buildSessionFactory(registry);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(lap_1);
		session.save(dev_1);
		transaction.commit();
		
		
		System.out.println("Saved ! ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
