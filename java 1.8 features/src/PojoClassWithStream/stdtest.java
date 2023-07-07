package PojoClassWithStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stdtest {
	
	public static List<Studentpojo> getstudents(){
		List<Studentpojo> stuList= new ArrayList();
		Studentpojo p=new Studentpojo(1, "shiva", 23, "bsc");
		Studentpojo p1=new Studentpojo(2, "raj", 24, "msc");
		Studentpojo p2=new Studentpojo(3, "bharath", 25, "btech");
		Studentpojo p3=new Studentpojo(4, "satya", 27, "mba");
		Studentpojo p4=new Studentpojo(5, "raghav", 25, "btech");
		Studentpojo p5=new Studentpojo(6, "ramarao", 25, "btech");
		stuList.add(p);
		stuList.add(p1);
		stuList.add(p2);
		stuList.add(p3);
		stuList.add(p4);
		stuList.add(p5);
		
		return stuList;
	}
	public static void main9(String[] args) {
		
		Optional<Integer>optional=getstudents().stream().map((a)->{
			return a.getAge();
		}).reduce((a,b)->{
			
			return a+b;
		});
		
		long a=getstudents().stream().count();
		System.out.println(optional.get());
		System.out.println(a);
	}
	
	public static void main4(String[] args) {
		
		System.out.println("sum of age");
	Optional<Integer>sum	=getstudents().stream().map((a)->{
			return a.getAge();
		}).reduce((a,b)->{
			return a+b;
		});
		System.out.println(sum.get());
		
	}
	
	
	public static void main3(String[] args) {
		
		System.out.println("collect the name");
		
	List<String>	list=getstudents().stream().map((a)->{
			return a.getName();
		}).sorted().collect(Collectors.toList());
		
		System.out.println(list);
	}
	public static void main(String[] args) {
		
		// collect the btech qualification  students
		
		List<Studentpojo> stuList=getstudents().stream().filter((a)->{
			return a.getQual().equalsIgnoreCase("btech");
		}).collect(Collectors.toList());
		System.out.println(stuList);
		
	}

	public static void main1(String[] args) {
		// 23 above age students
		getstudents().stream().filter((a)->{
			if(a.getAge()>23) return true;
			else return false;
		}).forEach((a)->{
			System.out.println(a);
		});
		
		
		//names of students
		getstudents().stream().map((a)->{
			return  a.getName();
		}).sorted().forEach((a)->{
			System.out.println(a);
		});
		
		
		// greater age of students 
		Optional<Integer> k=getstudents().stream().map((a)->{
			
			return a.getAge();
		}).reduce((a,b)->{
			if(a>b) return a;
			else return b;
		});
		System.out.println(k.get());
		
		
	}
	

}
