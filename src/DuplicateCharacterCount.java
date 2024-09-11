import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCount 
{
	public static void main(String[] args) 
	{
		duplicateCharactersCount("Hellow world");
	}
	
	public static void duplicateCharactersCount(String s){
		Map<Character, Integer> charCountMap = new HashMap<>();
		s = s.toLowerCase();
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == ' '){
				continue;
			}
			
			if(charCountMap.containsKey(c)){
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
		}
		
		System.out.println("Duplicate characters count : ");
		for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
			if(entry.getValue()>1){
				System.out.println(entry.getKey()+ " : "+entry.getValue());
			}
		}
	}
}
