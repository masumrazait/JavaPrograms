package practiceJavaCode;

import java.util.Scanner;

public class NonRepeatingCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any word : ");
		String userinput = sc.nextLine().toLowerCase();
		for (char c : userinput.toCharArray())
			if (userinput.indexOf(c) == userinput.lastIndexOf(c))
				System.out.println("non repeating characters: " + c);
	}
}