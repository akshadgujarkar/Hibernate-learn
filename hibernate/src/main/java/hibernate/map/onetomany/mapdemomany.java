package hibernate.map.onetomany;
import org.hibernate.*;
import java.util.*;
import org.hibernate.cfg.Configuration;
public class mapdemomany {
	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		//creating question
		questionmany q1 = new questionmany();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java");
		
		//creating answer
		Answermany answer = new Answermany ();
		answer.setAnswerid(343);
		answer.setAnswer("java is programming answer");
		
		Answermany  ans2 = new Answermany ();
		ans2.setAnswerid(344);
		ans2.setAnswer("This is optional answer");
		
		Answermany  ans3 = new Answermany();
		ans3.setAnswerid(345);
		ans3.setAnswer("This is optional22 answer");
	
		List<Answermany> list = new ArrayList<Answermany>();
		list.add(answer);
		list.add(ans2);
		list.add(ans3);
		
		q1.setAnswers(list);
		
	      		
	       		
	       		
	       		
	       		
	       		
		
		//save above code we are using the session bcoz session has ability to save 
		Session s = sessionfactory.openSession();
		Transaction tx = s.beginTransaction();
		
		s.save(answer);
		s.save(ans2);
		s.save(ans3);
		s.save(q1);
		
		
		
		//this is for fetching the data from question table to answer table (one to many)relations
		/*questionmany q =(questionmany) s.get(questionmany.class,1212);
		System.out.println(q.getQuestion());
		for(Answermany a : q.getAnswers())
		{
			System.out.println(a.getAnswer());
			
		}
		
		*/
		tx.commit();
		s.close();
		sessionfactory.close();
		
		
	}

}
