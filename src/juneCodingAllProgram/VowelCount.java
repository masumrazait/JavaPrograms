package juneCodingAllProgram;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any word: ");
		String str = sc.nextLine();
		String vowel = "AEIOUaeiou";
		int count = 0;
		for (char c : str.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.println(c);
				count++;
			}
		}
		System.out.println(count);
	}

}
