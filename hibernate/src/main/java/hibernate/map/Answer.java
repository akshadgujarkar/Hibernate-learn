package hibernate.map;
import javax.persistence.*;
@Entity
 class Answer {
  
	@Column(name="answer_id")
	@Id
	private int answerid;
	private String answer;
	
	@OneToOne(mappedBy="answer")
	private question que;
	
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
}
