package April25;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String word="ape,zeep,rose,rose,dell,go,hp,go";
		String words[]=word.split(",");
		Set<String>uniq=new HashSet<>();
		
		for(String word1:words) {
			uniq.add(word1.trim());
			
		}
		for (String word1 : uniq) {
			System.out.print(word1 + ",");
		}
	}

}
