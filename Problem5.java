
public class Problem5 
{
	public static void main(String[] args) 
	{
		int smallestDivisible = 1;
		for(int number =2; number <=20;number++)
		{	
			if(isPrime(number))
			{
				System.out.println(number);
				smallestDivisible = smallestDivisible*number;
			}
		}	
		for(int check=1;check<=20;check++)
		{	
			if(smallestDivisible%check!=0 && check%2==0)
				smallestDivisible = smallestDivisible*2;
			else if(smallestDivisible%check!=0 && check%3==0)
				smallestDivisible = smallestDivisible*3;
		}
		System.out.println(smallestDivisible);
		
	}	




	public static boolean isPrime(int number)
	{
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
				return false;
		}
		return true;
	
	}
	
}


