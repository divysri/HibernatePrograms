package com.transgene.example;

import java.util.Date;

import org.hibernate.Session;

public class GeneratedAUTODemo {

	public static void main(String[] args) {
		
		Session session=null;
		try{
		    session=HibernateUtil.getSessionFactory().openSession();
		    Employee emp=new Employee();
		    emp.setEmail("divya@gmail.com");
		    emp.setEmpName("divya");
		    emp.setDob(new Date());
		    emp.setSalary(4000.00);
		    session.beginTransaction();
		    session.save(emp);
		    session.getTransaction().commit();
		   // HibernateUtil.getCloseSessionFactory();
		    
		}
		catch(Exception x)
		{
			x.printStackTrace();
		}

	}

}
