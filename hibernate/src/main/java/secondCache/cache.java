package secondCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class cache {


public static void main(String args[])
{
	
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	
	Session s1 = factory.openSession();
	
	// if we fetch the object from any table in particular session required 
	// and being using the second level cache then it will be used in another 
    // session also. 
	// if we are using the first level cache then the object remain in the cache
	// until session is open after closing the session it will get destroyed.
	
	
	s1.close();
	
	
	Session s2 = factory.openSession();
	
	// hibernate doesn't fire a select query or any other query when object is 
	// present in the second level cache 
	// if we are using first level then it will fire a query to get the object 
	// from database because first level cache remains upto particular session only
	// first level cache is by default 
	// to enable second level cache we have to download the jar files or dependencies
	// in pom.xml file (dependencies) called as ehcache and hibernate.ehcache 
	
	s2.close();
	
}
}
