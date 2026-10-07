package com.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver" );
		
		con.setProperty("hibernate.connection.url","jdbc:mysql://db01.dbhost.dev:5051/db_455eyhvdv" );

		con.setProperty("hibernate.connection.username","user_455eyhvdv" );
	
		
		con.setProperty("hibernate.connection.password","p455eyhvdv" );
		
		con.setProperty("hibernate.hbm2ddl.auto","update" );
		con.setProperty("hibernate.show_sql","true" );
		con.setProperty("hibernate.formet_sql","true" );
		
		con.addAnnotatedClass(Students.class);
		
		SessionFactory sessionFactory=con.buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Students student = new Students(102, "Naveen", "naveenkd045@gmail.com", "advanced java programing");
		session.beginTransaction();
		session.persist(student);
		
		
		session.getTransaction().commit();
		System.out.println("Successfully Inatlled");
	}

}