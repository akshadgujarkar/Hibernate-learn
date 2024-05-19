package akshad.e_commerce;

import akshad.e_commerce.*;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class emdemo {
	public static void main(String args[])
	{
		 System.out.println( "Configuration started" );
	        Configuration cfg = new Configuration();
	        cfg.configure();
	        SessionFactory sessionfactory = cfg.buildSessionFactory();
	        System.out.println(sessionfactory);
	        student s1 = new student();
	        s1.setCity("pune");
	        s1.setName("akshad_emb");
	        s1.setSid(1000);
	        
	        Certificate certificate = new Certificate();
	        certificate.setCource("Web dev");
	        certificate.setDuration("5 months");
	        s1.setCerti(certificate);
	        
	        Address ad = new Address();
	        Certificate cert = new Certificate();
	        cert.setCource("hibernate");
	        cert.setDuration("2 months");
	        ad.setCert(cert);
	        
	        Session session = sessionfactory.openSession();
	        Transaction tx = session.beginTransaction();
	        //object save;
	        session.save(s1);
	        session.save(ad);
	        tx.commit();
	        session.close();
	        sessionfactory.close();
	        
	        
	        
	}
	
}
