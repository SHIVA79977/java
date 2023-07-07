package Spring_IOC_Constuctor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tl {
	private Devlopver devlopver;
@Autowired
	public Tl(Devlopver devlopver) {
	
		this.devlopver = devlopver;
	}
	public void dowork() {
		System.out.println("tl work started");
		devlopver.dowork();
		System.out.println("tl work end");
	}

}
