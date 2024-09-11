import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray 
{

	public static void main(String[] args) 
	{
		int[] numbers = {20,1,2,3,4,4,4,5,6,7,8,9,10,12,11};
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<=numbers.length-1;i++)
		{
			set.add(numbers[i]);
		}
		System.out.println(set);
		
		for(int i : set){
			System.out.print(i+" ");
		}
	}
}


