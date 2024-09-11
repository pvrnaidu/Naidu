
public class FactorialOfANumber 
{

	public static void main(String[] args) 
	{
		factorialNumber(5);
		practice();
	}
	
	public static void factorialNumber(int num){
		int factorial = 1;
		for(int i = 1; i<=num; i++){
			factorial = factorial*i;
		}
		System.out.println("Factorial number of "+ num +" is : " + factorial);
	}
	
	public static void practice(){
		int num = 3;
		int factorial = 1;
		for(int i = 1; i<=num; i++){
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
	

}
