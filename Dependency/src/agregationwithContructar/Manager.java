package agregationwithContructar;

public class Manager {
	private Tl tl;
	
	

	public Manager(Tl tl) {
		
		this.tl = tl;
	}



	public void dowork() {
		System.out.println("manager work started");
		tl.dowork();
		System.out.println("manager work end");
	}

}
