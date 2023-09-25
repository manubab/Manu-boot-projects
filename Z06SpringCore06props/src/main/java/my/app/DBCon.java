package my.app;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
@Component("dbcon")
public class DBCon 
{
	@Value("${my.db.driver}")
	private String driver;

	
	
	
	
	
	@Override
	public String toString() {
		return "DBCon [driver=" + driver + "]";
	}
	
	
	
	

}
