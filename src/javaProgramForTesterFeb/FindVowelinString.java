package javaProgramForTesterFeb;

import java.util.Scanner;

public class FindVowelinString {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String input = st.nextLine();
		String vowel = "AEIOUaieou";
		for (char c : input.toCharArray()) {
			if (vowel.indexOf(c) != -1) {
				System.out.println(c);
			}
		}
	}
}
