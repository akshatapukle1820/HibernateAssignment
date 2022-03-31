package com.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.factory.HibernateSessionFactory;

public class UpdateBook {

	public static void main(String gg[])
	{
		 SessionFactory factory= HibernateSessionFactory.getSessionFactory();
				 
	    //2. from sessionfactory --> session
	     Session session = factory.openSession();
	 
	     
	    //3. need to start the transaction
	     Transaction tx =  session.getTransaction();
	     
	     //4. create  an object
	     Book bookToUpdate = session.get(Book.class, 4);
	     bookToUpdate.setBook_price(bookToUpdate.getBook_price()+800);
	     bookToUpdate.setBook_name("LaxmiBai");
	     bookToUpdate.setBook_author("Vikas Sharmar");
	     
	     try
	     {
	    	 tx.begin();
	    	 session.update(bookToUpdate); //in place of update you can also write merge method
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
