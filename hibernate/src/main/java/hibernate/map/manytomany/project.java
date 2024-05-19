package hibernate.map.manytomany;
import java.util.List;

import javax.persistence.*;



@Entity
public class project {
	
	@Id
	private int pid;
	@Column(name="project_name")
	private String name;
	
	@ManyToMany(mappedBy="projects")
	private List<emp> emps;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<emp> getEmps() {
		return emps;
	}

	public void setEmps(List<emp> emps) {
		this.emps = emps;
	}

	public project(int pid, String name, List<emp> emps) {
		super();
		this.pid = pid;
		this.name = name;
		this.emps = emps;
	}

	public project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
