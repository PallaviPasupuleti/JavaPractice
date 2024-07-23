
public class DuplicateCharacters {
	public static void main(String[] args)
	{
		String s1="Vinyahanish";
		char[] c=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
			if(c[i]==c[j])
			{
				System.out.println("Duplicate character is " +c[i] );	
			}
			}
		}
	}

}
