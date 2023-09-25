package my.app;

public class Reository 
{
	private String entity;

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	
	
	

	public Reository() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reository(String entity) {
		super();
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "Reository [entity=" + entity + "]";
	}
	
	
	

}
