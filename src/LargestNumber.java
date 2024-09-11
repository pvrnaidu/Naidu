
public class LargestNumber {

	public static void main(String[] args) {
		largestNumber();
	}

	public static void largestNumber(){
		int[] arr = {1,2,3,4,5,6};
		int max = arr[0];
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("Maximum number in an array is : "+max);
	}
}
