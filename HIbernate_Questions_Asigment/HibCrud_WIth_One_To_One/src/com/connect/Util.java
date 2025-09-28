package com.connect;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Student;

public class Util {

	public Session getconnect()
	{
		Session sess = null;
		
		Properties properties =  new Properties();
		
		
		properties.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		properties.setProperty("hibernate.connection.password", "");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/s2");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.format_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		
		
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
		        .applySettings(properties)
		        .build();

		Metadata metadata = new MetadataSources(registry)
		        .addAnnotatedClass(Address.class)
		        .addAnnotatedClass(Student.class)
		        .buildMetadata();

		SessionFactory sf = metadata.buildSessionFactory();

		sess =  sf.openSession();
		return sess;
	}
}
