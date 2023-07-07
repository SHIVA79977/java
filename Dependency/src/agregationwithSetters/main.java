package agregationwithSetters;

public class main {
	
	
	public static void main(String[] args) {
		//agregation means work with diffrent object
		
		
		//object creation and object injection using [setter] method
		Manager manager = new Manager();
		Devlopver devlopver= new Devlopver();
		Tl tl= new Tl();
		tl.setDevlopver(devlopver);
		manager.setTl(tl);
		manager.dowork();
		
	}

}
