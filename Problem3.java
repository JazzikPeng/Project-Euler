
public class Problem3 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		long numOfPrimeFactor = 0;
		long largest = 1;
		long primeFactor = 1;
		long num = 600851475143L;
		long factor = num/2 + 1;
		long i = 2;
		boolean yes = true;
		while( primeFactor <= factor && Math.pow((double)largest, (double)numOfPrimeFactor) < num)
		{	
			System.out.println("largest is" + largest);
			if(num%primeFactor==0 && primeFactor > largest)
			{	
				while(i <primeFactor && yes)
				{	
//					System.out.println("i is" + i);
					if(primeFactor%i!=0 )//&& yes && i < primeFactor 
					{
						i++;
//						System.out.println(i);
					}
						else{
							yes = false;}
				}
				if(yes)
					numOfPrimeFactor++;
					largest = primeFactor;

	
				
				i = 2;
			}
			primeFactor++;	
//			System.out.println("primeFactor is " + primeFactor);
		}
		System.out.println(largest);
	}

} 
