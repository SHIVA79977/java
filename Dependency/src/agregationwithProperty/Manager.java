package agregationwithProperty;

public class Manager {
	private Tl tl;
	
	public void dowork() {
		System.out.println("manager work started");
		tl.dowork();
		System.out.println("manager work end");
	}

}
