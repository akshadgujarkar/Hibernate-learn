package hibernate.map;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class mapdemo {
	public static void main(String args[])
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionfactory = cfg.buildSessionFactory();
		
		//creating question
		question q1 = new question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java");
		
		//creating answer
		Answer answer = new Answer();
		answer.setAnswerid(343);
		answer.setAnswer("java is programming answer");
		q1.setAnswer(answer);
		
		
		//creating question
				question q2 = new question();
				q2.setQuestionId(242);
				q2.setQuestion("what is collection framework");
				
				//creating answer
				Answer answer1 = new Answer();
				answer1.setAnswerid(344);
				answer1.setAnswer("API to work with object string class");
	       		q2.setAnswer(answer1);
	       		
	       		
	       		
	       		
	       		
	       		
	       		question q3 = new question();
				q3.setQuestionId(23422);
				q3.setQuestion("what is collection framework");
				
				//creating answer
				Answer answer3 = new Answer();
				answer3.setAnswerid(4324);
				answer3.setAnswer("API to work with object string class");
	       		q3.setAnswer(answer3);
	       		
	       		
	       		
	       		
	       		
	       		
	       		
	       		
		
		//save above code we are using the session bcoz session has ability to save 
		Session s = sessionfactory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(q1);
		s.save(q2);
		s.save(q3);
		s.save(answer);
		s.save(answer1);
		s.save(answer3);
		tx.commit();
		s.close();
		sessionfactory.close();
		
		
	}

}
