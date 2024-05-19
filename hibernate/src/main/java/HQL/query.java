package HQL;
import javax.persistence.*;

import java.util.*;
import org.hibernate.cfg.*;
import akshad.e_commerce.*;
import org.hibernate.*;
import org.hibernate.query.Query;


public class query {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
	    /*
	      
	      HQL 
	      Syntax 
	      Query
	      
	     */
		
		String query = "from student";
		Query q = s.createQuery(query);  //query from org.hibernate
		
		//single result return  ( Unique)  -> uniqueResult() method 
		//multiple result return (List)    -> list() -> method 
		
		List<student> stulist = q.list(); //returns multiple rows in the form of list
		
		for(student stu : stulist) {
			
			System.out.println(stu.getName());
		}

		
		String dynamic="'akshad'";   // not suitable use only parameter method;
		String query2 = "from student where name="+dynamic;
		Query q2 = s.createQuery(query2);
	    System.out.println(((student)q2.uniqueResult()).getSid());
		
	    /*
	    "x can be a dynamic variable usually created while taking the value from user";
	    
	    String query = " from student where city=:x"; passing parameter
	    
	    Query q = s.createQuery(query);
	    q.setParameter("x","pune");
	    q.setParameter(name,value);  <- syntax
	    
	  */
	    
	    System.out.println("Deleting query of hibernate started");
	    
	    Transaction tx = s.beginTransaction();
	    String query3 = "delete from student where city=:c";
	    Query q3 = s.createSQLQuery(query3);
	    q3.setParameter("c","banglore");
	   int update1 =  q3.executeUpdate();
	    System.out.println("successfully deleted");
	    
	    System.out.println("updating query of hibernate started");
	    Query q4 = s.createQuery("update student set city=:cc where sid=:i");
	    q4.setParameter("cc","banglore");
	    q4.setParameter("i",104);
	    int update2 = q4.executeUpdate();
	    System.out.println("updating row successfully");
	    
	    tx.commit();
	    
	   
	    /*
	    System.out.println("Joining query important");
	    Query q5 = s.createQuery("select q.questionId , q.question , a.answer from question as q INNER JOIN q.answer as a");
	    List<Object []> list1  = q5.list();
	    for( Object arr[] : list1) {
	    	
	    	System.out.println(Arrays.toString(arr));
	    	
	    }
	    
	    */
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		System.out.println("finished");
		
		
		
		
		s.close();
		factory.close();

		
		
		
		
	}

}



