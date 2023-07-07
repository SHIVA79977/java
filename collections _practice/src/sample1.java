import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Function;

public class sample1 {
	
	public static void main(String[] args) {
//		long startTime = System.nanoTime(); // start timing
//
//		// create and manipulate an ArrayList
//		List<String> list = new ArrayList<String>();
//		list.add("shiva");
//		list.add("shiva");
//		list.add("shiva");
//		list.add("shiva");
//		list.
//		
//		for (int i = 0; i <=0; i++) {
//			list.remove(3);
//		}
//		
//		long endTime = System.nanoTime(); // end timing
//		long duration = (endTime - startTime);  //calculate duration in nanoseconds
//		//double seconds = (double)duration / 1_000_000_000.0; // convert to seconds
//
//		System.out.println("Execution time: " + duration + " seconds");
		
		Stack<String> list = new Stack<String>();
		
		list.add("shiva");
		list.push("ajay");
		list.addElement("sagar");	
		System.out.println(list.peek());
		list.pop();
		list.pop();
		list.pop();
		
		
		
		System.out.println(list.capacity());
		list.forEach((a)->{System.out.println(a);});
		//list.add(3, "linga");
		System.out.println("-----------------------");
		//list.forEach((a)->{System.out.println(a);});
		
		
		
		

	}

}
