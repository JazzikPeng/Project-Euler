
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		int sumOfEven=0;
		do
		{
			fib3 = fib1+fib2;
			System.out.println(fib3);
			if(fib3%2==0)
				sumOfEven = sumOfEven + fib3;
			fib1 = fib2;
			fib2 = fib3;
		} while(fib3 < 4E6);
		System.out.println(sumOfEven);
	}

}
