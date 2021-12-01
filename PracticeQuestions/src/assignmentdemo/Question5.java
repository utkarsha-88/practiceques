package assignmentdemo;
import java.util.Arrays;
import java.util.List;

public class Question5 {

	public static void main(String[] args) {
		List<Integer> integerList5=Arrays.asList(12,13,88,90,67,45);
		
		//Finding maximum
		long maximum=integerList5.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println("Maximum number is: "+ maximum);
		
		//Finding minimum
		long minimum=integerList5.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println("Minimum number is: "+minimum);
		
		//Finding average
		long sum=integerList5.stream().reduce(0,(i,j)->i+j);
		System.out.println("The value of sum is: "+sum);
		long count=integerList5.stream().count();
		System.out.println("The value of count is: "+count);
		System.out.println("***Average is***");
		double result;
		result=((double)sum)/count;
		System.out.println("Average of list numbers is: "+(result));

	}

}
