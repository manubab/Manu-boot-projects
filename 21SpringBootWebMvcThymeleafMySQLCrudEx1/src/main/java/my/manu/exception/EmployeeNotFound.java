package my.manu.exception;


@SuppressWarnings("serial")
public class EmployeeNotFound extends Exception 
{
	
	public EmployeeNotFound(String msg)
	{
		super(msg);
	}
	
	public EmployeeNotFound()
	{
		super();
	}

}
