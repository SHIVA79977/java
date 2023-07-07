package composistion;

public class Manager {
	private Tl tl= new Tl();
	
	public void dowork() {
		System.out.println("manager work started");
		tl.dowork();
		System.out.println("manager work end");
	}

}
