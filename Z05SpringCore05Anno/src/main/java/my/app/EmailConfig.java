package my.app;

import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
@Component("eob")
public class EmailConfig
{
	
	@Value("gmail")
	private String host;
	
	@Value("123")
	private int port;

	@Override
	public String toString() {
		return "EmailConfig [host=" + host + ", port=" + port + "]";
	}

	
	
	
	
}
