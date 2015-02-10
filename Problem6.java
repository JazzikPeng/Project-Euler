
public class Problem6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		int sum = 0;
		int squareSum = 0;
		for(int i = 1; i<=100;i++)
		{	
			sum = sum + i;
			squareSum = squareSum + i*i;
		}	
		System.out.println(sum);
		System.out.println(squareSum);
		System.out.println(sum*sum);
		System.out.println(sum*sum-squareSum);
			
		// TODO Auto-generated method stub

	}

}
