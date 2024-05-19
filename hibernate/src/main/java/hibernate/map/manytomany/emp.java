package hibernate.map.manytomany;
import javax.persistence.*;
import java.util.*;

@Entity
public class emp {

	@Id
	private int eid;
	private String name;
	
	@ManyToMany
	//@JoinTable(name="emp_learn") from this we can change the name of the newly created join table
	private List<project> projects;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<project> getProjects() {
		return projects;
	}

	public void setProjects(List<project> projects) {
		this.projects = projects;
	}

	public emp(int eid, String name, List<project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
