
public class PerfectNumbers1_100 {

	public static void main(String[] args) {
		
		System.out.println("Perfect numbers from 1 to 100");
		for(int num = 1; num<=100; num++){
			int sum = 0;
			for(int i = 1; i<=num/2; i++){
				if(num%i == 0){
					sum = sum + i;
				}
			}
			if(num == sum){
				System.out.println(num);
			}
		}
	}

}
