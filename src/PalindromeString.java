
public class PalindromeString 
{
	public static void main(String[] args) 
	{
		isPalindrome1("madam");
		isPalindrome2("racecar");


	}

	public static void isPalindrome1(String s){
//		String s = "madam";
		boolean isPalindrome = true;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) != s.charAt(s.length() -i -1)){
				isPalindrome = false;
				break;
			}
		}

		if (isPalindrome) {
			System.out.println(s+ " is a palindrome string");
		} else {
			System.out.println(s+ " is not a palindrome string");
		}
	}

	public static void isPalindrome2(String s){
//		String s = "racecar";
		String rev = "";
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			rev = c+rev;
		}

		if(s.equals(rev)){
			System.out.println(rev+ " is a palindrome");
		}else {
			System.out.println(rev+ " is not a palindrome");
		}
	}

}
