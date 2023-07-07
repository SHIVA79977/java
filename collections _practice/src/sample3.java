import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sample3 {
	public static void main(String[] args) {
		List<List<Integer>> numbers = Arrays.asList( Arrays.asList(1,2,3,4),Arrays.asList(23,45,24,4));
		//List<List<Integer>> evenNumbers = numbers.stream().flatMapToInt();
		                                    
		System.out.println(evenNumbers);

	}
	
	
	
	

}
