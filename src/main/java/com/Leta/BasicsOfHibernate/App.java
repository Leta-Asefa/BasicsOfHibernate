package com.Leta.BasicsOfHibernate;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student student=new Student("2","Kebede","SE");
    	
//    Configuration config=new Configuration().configure();
//    config.addAnnotatedClass(Student.class);
//    SessionFactory factory=config.buildSessionFactory();
//    Session session=factory.openSession();
//    Transaction transaction=session.beginTransaction();
//    session.save(student);
//    transaction.commit();
//    System.out.println("Saved !");
    	
    	
    	
    	Configuration config= new Configuration().configure(); // if the hibernate xml file is default use configure() 
    															//without parameter if not configure("xmlFileName.xml");
    	config.addAnnotatedClass(Student.class);	
    
    	ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    
    	SessionFactory factory=config.buildSessionFactory(registry);
    	
    	Session session=factory.openSession();
    	Transaction transaction=session.beginTransaction();
    	session.save(student);
    	transaction.commit();
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
