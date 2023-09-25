package my.app.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;
@Component("eobj")
public class ExcelExternalFileSheet 
{
	private String fileName;
	private String mode;
	
	public String getFileName() {
		return fileName;
	}
	public String getMode() {
		return mode;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public ExcelExternalFileSheet(String fileName, String mode) {
		this.fileName = fileName;
		this.mode = mode;
		
		System.out.println("Object created :2-param");
	}
	public ExcelExternalFileSheet() {
		System.out.println("Object created :0-param");
	}
	@PostConstruct
	public void setup()
	{
		//...............
		System.out.println("from init method");
	}
	@PreDestroy
	public void clean()
	{
		//..........
		System.out.println("from  destroy method");
	}
//	@Override
//	public void destroy() throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
	//@Override
//	public void afterPropertiesSet() throws Exception {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
	
	

}
