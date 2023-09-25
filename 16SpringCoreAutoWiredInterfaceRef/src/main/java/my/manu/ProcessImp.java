package my.manu;

import org.springframework.stereotype.Component;

@Component("pob")
public class ProcessImp implements IProcess {

	@Override
	public void doProcess() {
		
		System.out.println("P1 Doing Process");

	}

}
