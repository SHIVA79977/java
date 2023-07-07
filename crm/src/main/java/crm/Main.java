package crm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		SampleDao d= new SampleDao();
		d.save();
		
	}

}
