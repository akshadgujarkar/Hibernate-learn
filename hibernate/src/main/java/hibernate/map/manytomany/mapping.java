package hibernate.map.manytomany;
import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class mapping {
	
	public static void main(String args[])
	{
		Configuration confi = new Configuration();
		confi.configure();
		SessionFactory sessionfactory = confi.buildSessionFactory();
		
		emp e1 = new emp();
		emp e2 = new emp();
		
		e1.setEid(11);
		e1.setName("akshad");
		
		
		e2.setEid(12);
		e2.setName("yash");
		
		
		project p1 = new project();
		project p2 = new project();
		p1.setPid(1);
		p1.setName("library");
		p2.setPid(2);
		p2.setName("chatbot");
		
		
		
		List<emp>  liste = new ArrayList<emp>();
		List<project> listp = new ArrayList<project>();
		
		liste.add(e1);
		liste.add(e2);
		
		
		listp.add(p1);
		listp.add(p2);
		
		e1.setProjects(listp);
	
		p1.setEmps(liste);
		
		Session session = sessionfactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		
		
		
		
		
		
		
		
		
		
		sessionfactory.close();
		
	}

}
