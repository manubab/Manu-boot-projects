package my.app.manu;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
@Component("cob")
public class MyChacheData {

	@Value("redis")
	private String provider;

	@Override
	public String toString() {
		return "MyChacheData [provider=" + provider + "]";
	}
	
	
}
