package BEAN;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext context= new AnnotationConfigApplicationContext(Spring_config.class);
Controller controller	=context.getBean(Controller.class);
	controller.logic();
	
	
	
	
	
}
}
