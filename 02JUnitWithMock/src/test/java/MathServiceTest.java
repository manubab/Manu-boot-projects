import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.manu.MathService;

public class MathServiceTest
{
	MathService ms=null;
	int expected;
	
	@BeforeEach
	public void setup()
	{
		ms=new MathService();
		expected=30;
	}
	
	@Test
	public void testAdd()
	{
		int acual=ms.add(10, 20);
		assertEquals(expected, acual);
		boolean result=ms.isEven(50);
	}
	
	
	public void clean()
	{
		ms=null;
	}

}
