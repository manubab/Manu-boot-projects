package my.manu;

import org.springframework.stereotype.Component;

@Component
public class Project {
	private String projectCode;
	private Employee employee;

	public Project() {
		super();
		System.out.println("Project Object Created ");
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", employee=" + employee + "]";
	}
	

}
