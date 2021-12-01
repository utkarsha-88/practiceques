package assignmentdemo;
import java.util.Arrays;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {
		List<Integer> integerList3=Arrays.asList(12,13,17,18,88,99,66);
		long total=integerList3.stream().count();
		
		//Count total number of elements
		System.out.println("Total number of elements are: "+total);

	}

}
