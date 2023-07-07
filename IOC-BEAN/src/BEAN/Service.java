package BEAN;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {
	
	@Autowired
	private Dao dao;
	
	public void logic () {
		System.out.println("service logic start");
		dao.logic();
		System.out.println("service logic start");
	}

}
