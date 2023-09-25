package my.manu;



import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductReportService
{
	
	//@Scheduled(fixedDelayString = "2000")
	
	//@Scheduled(fixedRate = 5000)
	
	//@Scheduled(cron = "10 * * * * *")
     
	@Scheduled(cron = "*/10 * * * * *")
	public void generatorReport()
	{
		System.out.println(" Hello : Manu Take this Information "+new Date());
		
	}

}
