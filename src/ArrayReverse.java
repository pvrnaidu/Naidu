
public class ArrayReverse {

	public static void main(String[] args) {
		arrayReverse();
	}
	
	public static void arrayReverse(){
		int[] arr = {1,2,3,4,5,6,7};
		for(int i = arr.length-1; i>=0; i--){
			System.out.println(arr[i]);
		}
	}

}
