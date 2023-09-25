package my.manu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		//ProductReportService report=ac.getBean("productReportService",ProductReportService.class);
		
		ProductReportService report=ac.getBean(ProductReportService.class);

		report.generatorReport();
	}

}
