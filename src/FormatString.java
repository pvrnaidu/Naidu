
public class FormatString {

	public static void main(String[] args) {
		formatString();
	}

	public static void formatString() {
		String s = "a!1b@2c#3";

		StringBuilder specialCharacters = new StringBuilder();
		StringBuilder digits = new StringBuilder();
		StringBuilder letters = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				letters.append(c);
			} else if (Character.isDigit(c)) {
				digits.append(c);
			} else {
				specialCharacters.append(c);
			}
		}
		
		System.out.println(specialCharacters+" "+digits+" "+letters);
	}

}
