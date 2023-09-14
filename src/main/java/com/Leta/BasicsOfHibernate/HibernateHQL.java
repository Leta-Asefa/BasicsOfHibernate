package com.Leta.BasicsOfHibernate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.Leta.ClassDesigns.Department;
import com.Leta.ClassDesigns.Learner;
import com.Leta.ClassDesigns.Student;

public class HibernateHQL {

	Session session=null;
	public HibernateHQL() {
		
		
		Configuration config=new Configuration().configure();
		config.addAnnotatedClass(Student.class).addAnnotatedClass(NameDepartment.class);
		ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory factory=config.buildSessionFactory(registry);
		 session=factory.openSession();
		 
		// addData();
		 
		// FetchDataUsingHQL();
		 
		 FetchDataUsingSQL();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
	
	private void FetchDataUsingSQL() {
	
//		SQLQuery query= session.createSQLQuery("select * from student;");
//		query.addEntity(Student.class);
//		
//		List<Student> list=query.list();
//		display(list);
//		
//		query=session.createSQLQuery("select * from student where name='Abebe' ;");
//		query.addEntity(Student.class);
//		
//		Student student=(Student) query.uniqueResult();
//		System.out.println(student);
//		
//		SQLQuery query=session.createSQLQuery("select * from student where name like '%e' ;");
//		query.addEntity(Student.class);
//		
//		List<Student> abList=query.list();
//		display(abList);
		
		
		
		// you need to create another class that can be used to cast the returned object from query
		String name="abebe";
		SQLQuery query=session.createSQLQuery("select name,department from student where name=:name ;");
		query.setParameter("name", name);
		query.addEntity(NameDepartment.class);
		List<NameDepartment> abList=query.list();
		for (NameDepartment element : abList) {
			
			System.out.println(element.getName() +" : " + element.getDepartment());
		}
		
	}

	void display(List<Student> list) {
		
		for (Student student : list) {
			System.out.println("-----------------------------------------");
			System.out.println(student.getName()+"  "+student.getDepartment());
		}
		
	}
	private void FetchDataUsingHQL() {
	
//		Query query=session.createQuery("select name,department from Student  ");
//		
//		List<Object[]> students=query.list();
//			for (Object[] student : students) {
//			System.out.println(student[0]+ " " + student[1]);
//			}
	//--------if you specify certain columns query.list will return array of objects----------------------	
			
			Query query=session.createQuery(" from Student  ");
			
			List<Student> students=query.list();
				display(students);
	
	
	
	
	
	}

	public void addData() {
		List<Student> list= Arrays.asList(new Student("1","Abebe","IT") , new Student("2","Kebede","CS") ,
				new Student("3","Tole","IT") ,new Student("4","Tadese","SE") ,new Student("5","Tsehay","IT") );
	
		session.beginTransaction();
			for (Student student : list) {
			
				session.save(student);
			}
		
		session.getTransaction().commit();	
			
			
			
			
			
		System.out.println("saved !");
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
