package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class sample1 {
	
	public static void main10(String[] args) {
		List<Integer> h=Arrays.asList(1,2,3,4,3,32,2,45,69,5);
	h.stream().map((a)->{
		if(a%2==0) return "square value"+"----"+a*a; 
		else return a;
		
		
	}).forEach((a)->{
		System.out.println(a);
	});
		
		
	
		
		
	}
	
	public static void main2(String[] args) {
		List<Integer> h=Arrays.asList(1,2,3,4,3,32,2,45,69,5);
		h.stream().filter((a)->{
			return a%2==0;
		}).sorted().distinct().map((a)->{
			return a*a;
		}).forEach((a)->{
			System.out.println(a);
		});
		
	}

	public static void main1(String[] args) {
		List<Integer> h=Arrays.asList(1,2,3,4,32,45,69,5);
		boolean d=h.stream().noneMatch((a)->{
			return a%2==0;
		});
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("shiva","sager","ajay","raj");
		
		list.stream().filter((a)->{
			if(a.equalsIgnoreCase("s"))
				return true;
			else return false;
			
			
		}).sorted().forEach((a)->{
			//System.out.println(a);
		});
		
		Stream<Object> s=list.stream().map((a)->{
			boolean b=false;
			return b;
		});
		System.out.println(s);
		
	}
	

}
