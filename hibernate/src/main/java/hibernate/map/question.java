package hibernate.map;
import javax.persistence.*;

@Entity
public class question {
	@Id
	@Column(name="question_id")
	private int questionId;
	private String question;
	@OneToOne
	//@Join(name="a-id")
	//creates a new column and data is fetched from answer table not set by question instance(object)
	private Answer answer;
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
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public question(int questionId, String question, Answer answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}
	public question() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
