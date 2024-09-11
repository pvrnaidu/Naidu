public class PalindromeNumber 
{

	public static void main(String[] args)
	{
		isPalindromeNumber(1221);
	}

	public static void isPalindromeNumber(int num){
		int orgNum = num;
		int rev = 0;
		while(num !=0){
			rev = rev*10+num%10;
			num = num/10;
		}
		if(orgNum == rev){
			System.out.println(orgNum+ " is a palindrome number");
		}else {
			System.out.println(orgNum+ " is not a palindrome number");
		}
	}
}
