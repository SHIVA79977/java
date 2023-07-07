package Spring_IOC_Setter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {
	private Tl tl;
	@Autowired
	public void setTl(Tl tl) {
		this.tl = tl;
	}

	public void dowork() {
		System.out.println("manager work started");
		tl.dowork();
		System.out.println("manager work end");
	}

}
