package akshad.e_commerce;
import org.hibernate.SessionFactory;
import java.util.*;



import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class fetchdemo {
	public static void main(String args[])
	{
		//get , load
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		 
		//get, load present in the session
		Session session = factory.openSession();
		
		//get - student :109
		student st2 = (student)session.get(student.class, 109);
		
		System.out.println("using get method : "+st2);
		System.out.println(st2.getCity()+" "+st2.getName());
		
		
		//return null because no found id of 101;
		student st3 = (student)session.get(student.class,101);
		System.out.println(st3);
		
		
		Address address = (Address)session.load(Address.class, 1);
		
		System.out.println("Using load method : "+address);
		System.out.println(address.getAddressid());
		System.out.println(address.getCity());
		System.out.println(address.getAddedDate());
		System.out.println(address.getStreet());
		System.out.println(address.getImage());
		
		//throw exception object not found; because no such id =2 found;
		//Address address2 = (Address)session.load(Address.class, 2);
		session.close();
		
		
		factory.close();
	}

}
 
/*
 
 get()
 ->get() method of hibernate Session returns null if object 
   if not found in cache as we as on database.
 ->get() involves database hit if object dosen't exists in 
   Session Cache and returns a fully initalized object which
   may involve several database call\
 ->use if you are not sure that object exists in database or
   not
   
   
 load()
 -->load() method throws ObjectNotFoundException if object is not 
    on cache as well as on database but never return null.
-->load method can return proxy in place and only initalize the object
   or hit the database if any method other than getid() is called on 
   by receiving object. this lazy initalization.
   increase speed.
-->use if you are sure about the object present in database or 
not.   
 
 
  
  
  
  
  
 */






















