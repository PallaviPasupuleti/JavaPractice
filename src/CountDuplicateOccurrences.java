import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicateOccurrences {
	public static void main(String[] args)
    {
	  String s1="thevoiceofindia";
	  Map<Character,Integer> map= new HashMap<Character,Integer>();
	  char[] c=s1.toCharArray();
	  for(char c1:c)
	  {
	  if(map.containsKey(c1))
	  {
		  map.put(c1, map.get(c1)+1);
	  }
	  else
	  {
		  map.put(c1, 1);
	  }
	  }
	  
	map.entrySet().stream().forEach(input -> System.out.println(input.getKey()+":"+input.getValue()));
	
	for(Map.Entry<Character, Integer> entry:map.entrySet())
	{
		if(entry.getValue()>1)
		{
			System.out.println("Duplicate value "+ entry.getKey()+" Repeating"+entry.getValue()+" times");
		}
	}
	 
	  
	}
	
}
