package akshad.e_commerce;
import org.hibernate.SessionFactory;
import java.util.*;
import java.io.*;



import org.hibernate.cfg.Configuration;
import org.hibernate.*;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Configuration started" );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionfactory = cfg.buildSessionFactory();
        System.out.println(sessionfactory);
        //System.out.println(factory.isClosed());
       // System.out.println("configuration done successfully");
        //creating student
        
        // creating object of student class 
        student st = new student();
        st.setName("akshad");
        st.setCity("pune");
        st.setSid(104);
        
        student s2 = new student();
        s2.setName("gujarkar");
        s2.setCity("banglore");
        s2.setSid(5);
        
         
        
        //creating object of address class
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("nagpur");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        //reading img
        FileInputStream fis = new FileInputStream("src/main/java/images.jpg");
        byte[] data= new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
       
        
        
        //save the object st
       // Session session = factory.getCurrentSession(); error because no current session is performed in the factory
          Session session = sessionfactory.openSession();        
        //session.beginTransaction();
        //session.save(st);
        //getting the current transaction 
        //session.getTransaction().commit();
        //session.close();
        
          Transaction tx = session.beginTransaction();
          session.save(st);
          session.save(ad);
          session.save(s2);
          tx.commit();
         
          session.close();
          System.out.println("done");
    }
}
