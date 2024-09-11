
public class SwapingData 
{

	public static void main(String[] args) 
	{
		dataSwaping();
		System.out.println();
		dataWapingWithoutThirdVariable();
	}
	
	public static void dataSwaping(){
		int a = 10;
		int b = 20;
		int temp = 0;
		System.out.println("Value of a before swaping : " + a);
		System.out.println("Value of b before swaping : " + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("Value of a after swaping : " + a);
		System.out.println("Value of b after swaping : " + b);
		
	}
	
	public static void dataWapingWithoutThirdVariable(){
		int a = 10;
		int b = 20;
		System.out.println("Value of a before swaping : " + a);
		System.out.println("Value of b before swaping : " + b);
		
		a = a+b; //10+20 = 30
		b = a-b; //30-20 = 10
		a = a-b; //30-10 = 20;
		System.out.println("Value of a after swaping : " + a);
		System.out.println("Value of b after swaping : " + b);
		
		
	}
	

}
