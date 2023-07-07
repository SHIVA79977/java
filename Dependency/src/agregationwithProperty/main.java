package agregationwithProperty;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class main {
	
	
	public static <T> void main(String[] args) {
		//object creation and object injection using [ constructor]
		Devlopver devlopver= new Devlopver();
		Tl tl= new Tl();
		Manager manager=new Manager();
		
		
		
		try {
			Class c =tl.getClass();
	          Field f = c.getDeclaredField("devlopver");
	         f.setAccessible(true);
			f.set(tl, devlopver);
			
			Class c1 =manager.getClass();
	          Field f1 = c1.getDeclaredField("tl");
	         f1.setAccessible(true);
			f1.set(manager, tl);
			System.out.println("done");
		} catch (Exception e) {
			System.out.println(e);
		}

		//manager.dowork();
		
		try {
			
		String s	=tl.toString();
	Class c	=s.getClass();
	System.out.println(c);
	

	
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
