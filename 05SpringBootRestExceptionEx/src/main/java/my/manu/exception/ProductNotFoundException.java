package my.manu.exception;

@SuppressWarnings("serial")
public class ProductNotFoundException extends RuntimeException
{
	
	public ProductNotFoundException() {
		super();
		
	}
	
	public ProductNotFoundException(String msg)
	{
		super(msg);
	}

}


