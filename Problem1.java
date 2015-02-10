
public class Problem1
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int sum = 0;
		int num = 0; 
		int range = 1000;
				;
		while(num<range)
		{	
			if(num%3==0 || num%5==0)
			{	
				System.out.println(num);
				sum = sum+num;
			}	
		num++;		
		}

		System.out.print(sum);
		// TODO Auto-generated method stub

	}

}
