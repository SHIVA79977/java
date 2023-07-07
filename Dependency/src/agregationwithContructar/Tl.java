package agregationwithContructar;

public class Tl {
	private Devlopver devlopver;

	public Tl(Devlopver devlopver) {
	
		this.devlopver = devlopver;
	}
	public void dowork() {
		System.out.println("tl work started");
		devlopver.dowork();
		System.out.println("tl work end");
	}

}
