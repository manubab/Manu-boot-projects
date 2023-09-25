package my.app;


public class ViewResolver
{
	private String prifix;
	private String suffix;
	
	public String getPrifix() {
		return prifix;
	}
	public void setPrifix(String prifix) {
		this.prifix = prifix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public ViewResolver(String prifix, String suffix) {
		this.prifix = prifix;
		this.suffix = suffix;
	}
	public ViewResolver() {
		super();
	}
	@Override
	public String toString() {
		return "ViewResolver [prifix=" + prifix + ", suffix=" + suffix + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
