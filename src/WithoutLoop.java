
public class WithoutLoop 
{

	public static void main(String[] args) 
	{
		naturalNumbers(1);
	}

	public static void naturalNumbers(int a)
	{
		if(a<=100)
		{
			System.out.println(a);
			naturalNumbers(a+1);	
		}
	}

	public static void odd(int b)
	{
		if(b<=30)
		{
			if(b%2!=0)
			{
				System.out.println(b);
			}
			odd(b+1);
		}
	}

	public static void even(int c)
	{
		if(c<=30)
		{
			if(c%2==0)
			{
				System.out.println(c);
			}
			even(c+1);
		}
	}

}
