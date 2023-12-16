package practiceJavaCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindTHeUniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String userInput=sc.nextLine();
		Set<Character>uniCharacters=new HashSet<>();
		for(char c : userInput.toCharArray())
			if(Character.isLetter(c))
				uniCharacters.add(c);
		uniCharacters.toArray();
		System.out.println("uniq charecter is:" + uniCharacters);
	}

}
