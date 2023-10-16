package org.infinite.test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.infinite.dbutils.HibernateUtils;
import org.infinite.pojo.Login;
public class TestClass {
	public static void main(String... args) {
		Login tb = new Login();
		tb.setUsername("boyini");
		tb.setPassword("jahnavi");
		Date t=new java.util.Date();
		tb.setLogintmp(new java.sql.Timestamp(t.getTime()));//timestamp is taking gettime long as input
		
		Transaction tx = null;
		// Get the session object.
		Session session = HibernateUtils.getSessionFactory().openSession();//open session
		try {
			// Start hibernate session.
			tx = session.beginTransaction();
			// Insert a new student record in the database.
			session.save(tb);//method for inserting 
			// Commit hibernate transaction if no exception occurs.
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null) {
				// Roll back if any exception occurs.
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			// Close hibernate session.
			session.close();
		}
	}

}
