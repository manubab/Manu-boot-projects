package my.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyService
{
	@Autowired
	@Qualifier("get01")
	private MyRepository repo;
	@Override
	public String toString() {
		return "MyService [repo=" + repo + "]";
	}

}
