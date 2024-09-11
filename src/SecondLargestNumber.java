
public class SecondLargestNumber {
	public static void main(String[] args) {
		secondLargest();
		secondSmallest();
	}
	
	public static void secondLargest(){
		int[] arr = {1,2,3,4,5,6};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int num : arr){
			if(num > largest){
				secondLargest = largest;
				largest = num;
			}else if(num > secondLargest && num < largest){
				secondLargest = num;
			}
		}
		System.out.println("Second largest number is : "+secondLargest);
	}
	
	public static void secondSmallest(){
		int[] arr = {1,2,3,4,5,6};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int num : arr){
			if(num < smallest){
				secondSmallest = smallest;
				smallest = num;
			}else if(num < secondSmallest && num > smallest){
				secondSmallest = num;
			}
		}
		System.out.println("Second smallest number is : "+secondSmallest);
	}
}
