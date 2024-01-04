import java.util.*;
public class CountOfCharacterInStringHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CountOfCharacterInStringHashMap mp = new CountOfCharacterInStringHashMap();
		characterCount("HelloWorld");
	}

	public static void characterCount(String a) {
		HashMap<Character, Integer> mp =new HashMap<>();
		char[] strArray = a.toCharArray();
		System.out.println(strArray);
		
		for (char c : strArray) {
			if(mp.containsKey(c))
			{
		
				mp.put(c, mp.get(c)+1);
			}
			else{
				mp.put(c,1);
			}
			System.out.println(c);
			System.out.println(mp);
		}
		
	}
}
