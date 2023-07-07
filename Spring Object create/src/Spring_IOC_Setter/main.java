package Spring_IOC_Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	
	
	public static void main(String[] args) {
		
		ApplicationContext contex= new AnnotationConfigApplicationContext(SpringConfig.class);
	Manager manager=contex.getBean(Manager.class);
		manager.dowork();
		
	}

}
