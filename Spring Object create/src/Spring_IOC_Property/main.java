package Spring_IOC_Property;




import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
		
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Springconfig.class);
		Manager manager=context.getBean(Manager.class);
		manager.dowork();
	}

}
