package akshad.e_commerce;
import javax.persistence.*;
@Embeddable  
public class Certificate {
	private String cource;
	private String duration;
	public Certificate(String cource, String duration) {
		super();
		this.cource = cource;
		this.duration = duration;
	}
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
