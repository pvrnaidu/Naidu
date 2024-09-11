
public class NumberReverse {

	public static void main(String[] args) 
	{
		numberReverse(123456789);
	}
	
	public static void numberReverse(int num){
		int rev = 0;
		while (num!=0) {
			rev = rev*10+num%10;
			num = num/10;
		}
		System.out.println("Reversed number is "+rev);
	}

}
