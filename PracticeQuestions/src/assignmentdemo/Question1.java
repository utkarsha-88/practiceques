package assignmentdemo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question1 {

	public static void main(String[] args) {
		List<Integer> integerList=new ArrayList<>();
		integerList.add(12);
		integerList.add(31);
		integerList.add(60);
		integerList.add(88);
		integerList.add(52);
		integerList.add(1);
		integerList.add(33);
		integerList.add(71);
		
		//numbers that are even
		integerList.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		

	}

}
