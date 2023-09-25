package my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hob")
public class HandlerInfo
{
	@Value("Data")
	private String reolverCode;
	
	@Value("Temp")
	private String pathToStore;

	@Override
	public String toString() {
		return "HandlerInfo [reolverCode=" + reolverCode + ", pathToStore=" + pathToStore + "]";
	}
	
	
	
	
	
	
	
	
	

}
