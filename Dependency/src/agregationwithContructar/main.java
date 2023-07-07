package agregationwithContructar;

public class main {
	
	
	public static void main(String[] args) {
		//object creation and object injection using [ constructor]
		Devlopver devlopver= new Devlopver();
		Tl tl= new Tl(devlopver);
		Manager manager=new Manager(tl);
		manager.dowork();
		
	}

}
