package jakarta_1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;
//@Component

@Named
class BusinessService
{
	private DataService dataService;

//	@Autowired
	
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public DataService getDataService() {
		System.out.println("setter injection would be perform");
		return dataService;
	}

	
}

// @Component

@Named
class DataService
{
	
}
@ComponentScan
@Configuration
public class CdiContextLauncherApplication {

	
	public static void main(String[] args) {
	
		try(var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class))
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class).getDataService());
			
			
		
			
		}

	}

}
