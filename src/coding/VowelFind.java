package coding;

import java.util.Scanner;

public class VowelFind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String userinput = sc.nextLine();
		String vowel = "A E I O U a e i o u";
		for (char c : userinput.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.println("latter is constant: " + c);
			}
		}

	}

}
