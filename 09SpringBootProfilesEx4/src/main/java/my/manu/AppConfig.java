package my.manu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
	public class AppConfig {
		
		@Bean
		@Profile({"default","qa"})
		public PdfExportService pdf() {
			PdfExportService p = new PdfExportService();
			p.setFileExt(".pdf");
			p.setFtype("Document-NPDF");
			return p;
		}

}
