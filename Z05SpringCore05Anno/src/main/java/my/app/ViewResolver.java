package my.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vob")
public class ViewResolver
{
	@Value("pages")
	private String prifix;
	
	@Value(".jsp")
	private String suffix;

	
	
	
	@Override
	public String toString() {
		return "ViewResolver [prifix=" + prifix + ", suffix=" + suffix + "]";
	}
	
	
	
	
	
	

}
