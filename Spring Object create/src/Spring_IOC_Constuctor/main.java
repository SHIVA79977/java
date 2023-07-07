package Spring_IOC_Constuctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
	
	
	public static void main(String[] args) {
		ApplicationContext contex= new AnnotationConfigApplicationContext(Springconfig.class) ;
		Manager manager=contex.getBean(Manager.class);
		manager.dowork();
		
	}

}
