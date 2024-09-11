import java.util.HashSet;

public class RemoveDulicatesFromString {

	public static void main(String[] args) {
		removeDuplicates();
	}

	public static void removeDuplicates() {
		String s = "Pikkili Venkata Rathnam Naidu";
		HashSet<Character> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (set.add(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
