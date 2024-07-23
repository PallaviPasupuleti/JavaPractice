
public class Prime {
	
	public static void main(String[] args)
	{
	 Prime p=new Prime();
	 p.prime();
	}
	
	public void prime()
	{
		int i=0;
		int maxnumber=100;
		for(i=1;i<=maxnumber;i++)
		{
			int count=0;
			for(int n=i;n>=1;n--)
			{
				if(i%n==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
			System.out.println("Prime"+i);
			}
			
		}
		
	}

}
