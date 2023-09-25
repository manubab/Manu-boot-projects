package my.manu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Format 
{
	@Autowired
	@Qualifier("apob")
	private IProcess iprocess;

	
	public IProcess getIprocess() {
		return iprocess;
	}


	public void setIprocess(IProcess iprocess) {
		this.iprocess = iprocess;
	}
	
	public void processDoneOrNot()
	{
		iprocess.doProcess();
		System.out.println("Yes work completed ");
	}


	@Override
	public String toString() {
		return "Format [iprocess=" + iprocess + "]";
	}

}
