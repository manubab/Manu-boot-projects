package my.manu;


public class Employee {
	private String employeeName;
	private Project project;

	public Employee() {
		super();
		System.out.println("Employee Object created");
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", project=" + project + "]";
	}

	public Employee(Project project) {
		super();
		this.project = project;
	}
	
	

}
