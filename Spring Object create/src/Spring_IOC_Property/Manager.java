package Spring_IOC_Property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	@Autowired
	private Tl tl;
	
	

	


	public void dowork() {
		System.out.println("manager work started");
		tl.dowork();
		System.out.println("manager work end");
	}

}
