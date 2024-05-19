package akshad.e_commerce;


import javax.persistence.*;


@Entity//(name="student_details") use to mark any class as entity
//@Table(name="mystudents") use to change the table details.
public class student {
	
	@Id  //use to mark column as id(primary key)
	//@GeneratedValue will automatically generate the unique primary key and increment according
    
	private int sid;
	//@Transient tells hibernate not to save this field
	//@Column to change the column name and details.
	private String name;
	
	private String city;
	
    private Certificate certi; // embedding object
	
	
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	public student(int sid, String name, String city) {
		super();
		this.sid = sid;
		this.name = name;
		this.city = city;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.sid+" : "+this.name+" : "+this.city;
		
	}
	
	
	
	

}

