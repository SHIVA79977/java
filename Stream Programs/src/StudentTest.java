import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentTest {

	public static List<Student> students() {
		List<Student> list = new ArrayList<Student>();

		Student s = new Student(1, "shiva", 23, "Bsc", 600.0);
		Student s1 = new Student(2, "sagar", 27, "Bsc", 800.0);
		Student s2 = new Student(3, "shiva", 29, "mtech", 337.0);
		Student s3 = new Student(4, "shiva", 25, "Bsc", 897.0);
		Student s4 = new Student(5, "raj", 24, "btech", 965.0);
		list.add(s);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		return list;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Integer[] j= {2,4,56,34,90,67};
		
		int temp=j[0];
		j[0]=j[1];
		j[1]=j[2];
		j[2]=j[3];
		j[3]=j[4];
		j[4]=j[5];
		
		j[5]=temp;
		
		for( int i=0;i<=j.length-1;i++) {
			System.out.println(j[i]);
		}
		
	}
	
	
	public static void main12(String[] args) {
		
		Integer[] j= {2,4,56,34,90,67};
		
		int temp;
		for(int i= 0;i<j.length-1;i++) {
			temp=j[i];
			if(j[i]>j[i+1]) {
			
			j[i]=j[i+1];
			j[i+1]=temp;
			
			}
			
		
			System.out.println(j[i]);
			
		}
		System.out.println(j);
		
	}
	
	public static void main11(String[] args) {
		
		Stream<Double> optional=students().stream().map((a)->{
			return a.getMarks();
		}).sorted();
				
		
		
	}
	
	public static void main9(String[] args) {
		 List<String> list = Arrays.asList("Geeks", "for",
                 "GeeksQuiz", "GeeksforGeeks", "GFG");

    System.out.println("The sorted stream is : ");

    // displaying the stream with elements
    // sorted in their natural order
    students().stream().sorted().forEach(System.out::println);
}

	
	
	public static void main10(String[] args) {
		
  Optional<Student> optional=students().stream().sorted(Comparator.comparingDouble(Student::getMarks).reversed()).skip(1).findFirst();
    System.out.println(optional);
       
		
	}
	
	public static void main8(String[] args) {
		
		Optional<Student> optional=students().stream().max((a,b)->{ Integer c=a.getMarks().compareTo(b.getMarks());
		return c;});
		
		System.out.println(optional);
		}
	
	
	
	public static void main6(String[] args) {
		
		students().stream().filter((a)->{
			
			if(a.getAge()<=23) 
				return true;
			else return false;
			
		}).forEach((a)->{
			System.out.println(a);
		});
		
	}
	
	public static void main5(String[] args) {
		
		Map<String, Double> list=students().stream().collect(Collectors.groupingBy(Student::getQual ,Collectors.averagingInt(Student::getAge ) ));
		System.out.println(list);
	}
	public static void main4(String[] args) {
		
		Map<String, Long> map = students().stream().map((a)->{
			
			return a.getName();
			
		}).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
	}

	public static void main3(String[] args) {
		students().stream().distinct().forEach((a)->{System.out.println(a);});;
	}
	
	
	public static void main2(String[] args) {
		Map<String, Long> map = students().stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

		System.out.println(map);
	}

	public static void main1(String[] args) {

		long s = students().stream().filter((a) -> {
			if (a.getName().equals("shiva")) {
				return true;

			} else {
				return false;
			}
		}).map((a) -> {
			return a.getName();
		}).count();

		System.out.println(s);

	}

}
