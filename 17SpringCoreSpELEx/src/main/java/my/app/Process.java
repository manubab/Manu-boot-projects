package my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Process 
{
	
	@Value("#{'Hello'.length()}")
	private int code;
	
	@Value("#{modelData.model.toUpperCase()}")
	private String model;

	@Override
	public String toString() {
		return "Process [code=" + code + ", model=" + model + "]";
	}
	
	
	
	

	

}
