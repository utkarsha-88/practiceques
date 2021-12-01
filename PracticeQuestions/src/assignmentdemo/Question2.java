package assignmentdemo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {

	public static void main(String[] args) {
		List<Integer> integerList2=new ArrayList<Integer>();
		integerList2.add(11);
		integerList2.add(33);
		integerList2.add(17);
		integerList2.add(199);
		integerList2.add(45);
		integerList2.add(10);
		integerList2.add(49);
		
		//Numbers that starts with 1
		integerList2.stream().map(i->i+"").filter(s->s.startsWith("1")).forEach(System.out::println);

	}

}
