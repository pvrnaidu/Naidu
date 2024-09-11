
public class PerfectNumbers {

	public static void main(String[] args) 
	{
		//sum of its proper divisors (1, 2, and 3) equals 6, excluding itself
		int num = 6;
		int sum = 0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum = sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println(num+" is a perfect number");
		}
		else
		{
			System.out.println(num+" is not a perfect number");
		}

	}

}
