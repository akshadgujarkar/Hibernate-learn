package hibernate.map.onetomany;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;

import java.util.*;

@Entity
public class questionmany {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)//because one question may have many answers
	private List<Answermany> answers;
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answermany> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answermany> answers) {
		this.answers = answers;
	}
	public questionmany(int questionId, String question, List<Answermany> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}
	public questionmany() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
