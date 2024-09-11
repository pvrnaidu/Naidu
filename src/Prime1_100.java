
public class Prime1_100 {

	public static void main(String[] args) {
		// a prime number is a number that can only be divided evenly by 1 and
		// the number itself without leaving a remainder.
		for (int num = 1; num <= 100; num++) {
			int count = 0;
			for (int j = 1; j <= num; j++) {
				if (num % j == 0)
					count++;
			}
			if (count == 2) {
				System.out.println(num);
			}
		}
	}

}
