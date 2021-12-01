package assignmentdemo;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question4 {

	public static void main(String[] args) {
		List<Integer> integerList4=Arrays.asList(12,56,44,77,34,23,90);
		
		//Obtain a sorted integer list
		integerList4.stream().sorted().forEach(System.out::println);
		

	}

}
