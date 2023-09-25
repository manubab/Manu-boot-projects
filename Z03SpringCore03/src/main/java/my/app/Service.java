package my.app;

public class Service
{
	private Reository rep;

	public Service(Reository repo) {
	
		this.rep = repo;
	}

	public Service() {
		super();
		
	}

	public Reository getRepo() {
		return rep;
	}

	public void setRepo(Reository repo) {
		this.rep = repo;
	}

	@Override
	public String toString() {
		return "Service [repo=" + rep + "]";
	}
	
	
	
	

	
	
	
}
