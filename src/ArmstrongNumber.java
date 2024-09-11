
public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		
		System.out.println(153%10);
		System.out.println(153/10);
		armStrongNumber(153);
		practice(153);
	}
	
	public static void armStrongNumber(int num){
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num>0){
			rem = num%10;
			num = num/10;
			sum = sum + (rem*rem*rem);
		}
		
		if(temp == sum){
			System.out.println(temp+" is a Armstrong number");
		}else{
			System.out.println(temp+ " is not a Armstrong number");
		}
	}
	
	public static void practice(int num){
		int temp = num;
		int rem = 0;
		int sum = 0;
		while(num>0){
			rem = num%10;
			num = num/10;
			sum = sum+(rem*rem*rem);
		}
		if(temp == sum){
			System.out.println(temp+" is a Armstrong number");
		}else{
			System.out.println(temp+" is not a Armstrong number");
		}
	}

}
