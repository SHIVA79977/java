package streamWithReduce;

import java.util.Optional;
import java.util.stream.Stream;

public class sample1 {
	public static void main(String[] args) {
		Stream<String> values=Stream.of("a","b","i","o","r");
		Optional<String> opt	=values.filter((a)->{
			if(a.equalsIgnoreCase("A")|a.equalsIgnoreCase("E")|a.equalsIgnoreCase("I")|a.equalsIgnoreCase("O")|a.equalsIgnoreCase("E"))
				return true;
			else return false;
		}).reduce((a,b)->{
			return a+b;
		});System.out.println(opt.get());
		
	}
	public static void main5(String[] args) {
		Stream<String> values=Stream.of("sh","iv","a","@123");
		Optional<String> opt	=values.reduce((a,b)->{
				
				return a+b;
				
			});System.out.println(opt.get());
		
	}
	public static void main4(String[] args) {
		Stream<String> values=Stream.of("shiva","raj","bharth","satya");
		Optional<String> opt	=values.reduce((a,b)->{
				if(a.length()>b.length()) return a;
				else return b;
				
			});System.out.println(opt.get());
		
	}
	
	public static void main3(String[] args) {
		Stream<Integer> values=Stream.of(1,2,345,67,56);
		Optional<Integer> opt	=values.reduce((a,b)->{
				if(a<b) return a;
				else return b;
				
			});System.out.println(opt.get());
	}
	public static void main2(String[] args) {
		Stream<Integer> values=Stream.of(1,2,345,67,56);
	Optional<Integer> opt	=values.reduce((a,b)->{
			if(a>b) return a;
			else return b;
			
		});System.out.println(opt.get());
		
	}

	public static void main1(String[] args) {
		Stream<Integer> values=Stream.of(1,2,345,67,56);
		Optional<Integer> opt = values.reduce((a,b)->{
			  return a+b;
		  });
		System.out.println(opt.get());

	}

}
