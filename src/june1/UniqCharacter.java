package june1;

import java.util.HashSet;
import java.util.Set;

public class UniqCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "masumraza";
		Set<Character> uniq = new HashSet<>();
		for (char c : str.toCharArray())
			if (Character.isLetter(c))
				uniq.add(c);
		System.out.println("uniq character is :" + uniq);
	}
}
