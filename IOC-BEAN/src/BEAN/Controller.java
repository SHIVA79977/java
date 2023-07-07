package BEAN;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class Controller {
	@Autowired
	private Service service;
	
	public void logic() {
		System.out.println("controller logic start");
		service.logic();
		System.out.println("controller logic end");
		
		
	}

}
