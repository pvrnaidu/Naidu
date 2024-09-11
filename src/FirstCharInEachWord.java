
public class FirstCharInEachWord {

	public static void main(String[] args) {
		String s1 = "Pikkili Venkata Rathnam Naidu";
		char a[] = s1.toCharArray();
		int length = a.length;
		System.out.println("Length of the Array : "+length);

		for (int i = 0; i < length; i++) {
			if (a[i] != ' ') {
				if (i == 0) {
					System.out.println(a[i]);

				} else if (a[i - 1] == ' ') {
					System.out.println(a[i]);
				}
			}

		}
	}
}
