
public class EachWordReverse {
	public static void main(String[] args) {
		wordReverse();
	}
	
	public static void wordReverse(){
		String s = "Pikkili Venkata Rathnam Naidu";
		String[] words = s.split(" ");
		String eachWord = "";
		for(int i = 0; i<words.length; i++){
			String rev = "";
			for(int j = 0; j<words[i].length(); j++){
				char c = words[i].charAt(j);
				rev = c + rev;
			}
			eachWord = eachWord+rev+" ";
		}
		
		System.out.println("Each word reverse is : "+eachWord);
	}
}
