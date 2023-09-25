package my.manu;

import org.springframework.stereotype.Component;

@Component("apob")
public class AdvProcessImpl implements IProcess {

	@Override
	public void doProcess() {
		
		System.out.println("Adv P1 Doing Process");
	}

}
