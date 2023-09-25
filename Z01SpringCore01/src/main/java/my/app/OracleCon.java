package my.app;


public class OracleCon 
{
	private String driver;
	private String url;
	
	
	
	
	public OracleCon(String driver, String url) {
		super();
		this.driver = driver;
		this.url = url;
	}
	public OracleCon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "OracleCon [driver=" + driver + ", url=" + url + "]";
	}
	
	
	
	
	
	

}
