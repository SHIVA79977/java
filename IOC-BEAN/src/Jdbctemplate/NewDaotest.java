package Jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewDaotest {
	
	
public static void main(String[] args) {
	ApplicationContext context= new  AnnotationConfigApplicationContext(spring_config.class);
	NewDao1 newDao1=context.getBean(NewDao1.class);
	
	NewDao2 New1=context.getBean(NewDao2.class);
	
	//New1.save(5, "ramu", 25, "mcom");
	
	//System.out.println(newDao1.getbyid(1));
	
	//System.out.println(newDao1.getcount());
	
	//System.out.println(newDao1.getperson(1));
	
	
	
}
}
