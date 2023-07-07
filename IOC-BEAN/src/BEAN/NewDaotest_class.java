package BEAN;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NewDaotest_class {
	
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Spring_config.class);
		NewDao n=context.getBean(NewDao.class);
		//String s=n.getbyname(1);
		//System.out.println(s);
			
		
		
			NewDao1 New=context.getBean(NewDao1.class);
			//New.savedata(1,"siva", 23, "bsc");
		
			
	}

}
