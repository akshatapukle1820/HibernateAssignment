package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.HibernateSessionFactory;

public class AddBook {

	public static void main(String gg[])
	{
		 SessionFactory factory= HibernateSessionFactory.getSessionFactory();
				 
	    //2. from sessionfactory --> session
	     Session session = factory.openSession();
	 
	     
	    //3. need to start the transaction
	     Transaction tx =  session.getTransaction();
	     
	     //4. create  an object
	     Book book=new Book("LaxmiBai","Vikas Sharmar",500.10);
	     try
	     {
	    	 tx.begin();
	    	 session.save(book); //call session.save(book)
	    	 tx.commit();
	    	 
	     }catch(HibernateException hx)
	     {
	    	 hx.printStackTrace();
	    	 tx.rollback();
	     }
	     
	     session.close();   //session close
	     
	     factory.close();   //close factory
	}
}
