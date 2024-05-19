package Pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import akshad.e_commerce.student;

public class hqlpagination {
	
	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
	     cfg.configure();
	     SessionFactory factory =  cfg.buildSessionFactory();
	     //required atleast 500 records
	     Session s = factory.openSession();
	     
	     String query = " from student ";
	     //Query<student> q1 = s.createQuery(query,student.class);
	     Query<student> q1 = s.createQuery(query);
	     //implementing pagination;
	     q1.setFirstResult(0);   //methods for pagination index size  of page
	     
	     q1.setMaxResults(1);    //methods for pagination index size of page
	      List<student> list = q1.list();
	     for(student stu : list)
	     {
	    	 System.out.println(stu.getName()+ stu.getCity());
	     }
	     
	     
	     s.close();
	     
	     factory.close();
	}

}
