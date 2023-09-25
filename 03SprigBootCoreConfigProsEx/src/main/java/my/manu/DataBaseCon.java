package my.manu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.manu")
public class DataBaseCon 
{
	
	private String driver;
	private String url;
	private String usr;
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
		return "DataBaseCon [driver=" + driver + ", url=" + url + ", usr=" + usr + ", psd=" + psd + "]";
	}

}
