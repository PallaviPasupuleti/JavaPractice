import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	List<Integer> array= new ArrayList<>();
		array.add(19);
		array.add(2);
		array.add(3);*/
		
		List<Integer> array=List.of(5,8,7,7,8,9,6);
		 
		int x=array.stream().sorted((a,b) ->(b -a)).skip(1).findFirst().orElseThrow(() ->new RuntimeException("No second highest number found"));
		System.out.println(x);
		
         
	}

}
