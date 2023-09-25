package my.app;

import java.util.Random;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")

public class MyRepository 
{
	private int code;

	public MyRepository() {
	   System.out.println("repo object created ");
		code=Math.abs(new Random().nextInt());
		
	}

	@Override
	public String toString() {
		return "MyRepository [code=" + code + "]";
	}
	
	
	

}
