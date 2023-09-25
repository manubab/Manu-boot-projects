package my.manu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataBaseBean
{
	@Value("${my.manu.driver}")
	private String driver;
	@Value("${my.manu.url}")
	private String url;
	@Value("${my.manu.usr}")
	private String usr;
	@Value("${my.manu.psd}")
	private String psd;
	
	
	
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
	public String getUsr() {
		return usr;
	}
	public void setUsr(String usr) {
		this.usr = usr;
	}
	public String getPsd() {
		return psd;
	}
	public void setPsd(String psd) {
		this.psd = psd;
	}
	@Override
	public String toString() {
		return "DataBaseBean [driver=" + driver + ", url=" + url + ", usr=" + usr + ", psd=" + psd + "]";
	}
	
	
	

}
