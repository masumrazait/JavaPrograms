package julyAllCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "masunn";
		Set<Character> uniq = new HashSet<>();
		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				uniq.add(c);
			}
		}
		System.out.println("Uniq character is : " + uniq);
	}
}
