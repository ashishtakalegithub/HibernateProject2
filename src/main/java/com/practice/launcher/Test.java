package com.practice.launcher;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.practice.entity.Config;
import com.practice.entity.Customer;
import com.practice.entity.Transection;

public class Test {
	public static void main(String[] args) {
		SessionFactory sessionFactory = Config.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		Customer customer1 = new Customer();
		customer1.setcName("Ashish Takale");
		customer1.setcEmail("ashishtakale@gmail.com");
		customer1.setcAddress("Pune");

		Customer customer2 = new Customer();
		customer2.setcName("Nihal Mulla");
		customer2.setcEmail("nihalnmulla@gmail.com");
		customer2.setcAddress("Kolhapur");

		Transection transection1 = new Transection();
		transection1.setDate(new Date());
		transection1.setTotal(1000);
		customer1.setTransection(transection1);
		Transection transection2 = new Transection();
		transection2.setDate(new Date());
		transection2.setTotal(2000);
		customer2.setTransection(transection2);
		session.save(transection1);
		session.save(transection2);
		session.save(customer1);
		session.save(customer2);
		session.close();
		sessionFactory.close();
	}

}
