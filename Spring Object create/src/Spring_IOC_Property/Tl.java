package Spring_IOC_Property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tl {
	@Autowired
	private Devlopver devlopver;
	
	public void dowork() {
		System.out.println("tl work started");
		devlopver.dowork();
		System.out.println("tl work end");
	}

}
