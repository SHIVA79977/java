package Spring_IOC_Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tl {
	private Devlopver devlopver;
	@Autowired
	public void setDevlopver(Devlopver devlopver) {
		this.devlopver = devlopver;
	}

	public void dowork() {
		System.out.println("tl work started");
		devlopver.dowork();
		System.out.println("tl work end");
	}

}
