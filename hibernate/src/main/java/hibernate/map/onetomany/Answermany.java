package hibernate.map.onetomany;
import javax.persistence.*;
@Entity
 class Answermany {
  
	@Column(name="answer_id")
	@Id
	private int answerid;
	private String answer;
	
	@ManyToOne
	private questionmany qm;
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
	public Answermany(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	public Answermany() {
		super();
		// TODO Auto-generated constructor stub
	}
}
