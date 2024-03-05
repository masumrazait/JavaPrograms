package javaProgramForTesterFeb;

import java.util.Scanner;

public class IndexPositionOfString {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String input = st.nextLine();
		System.out.println("Enter the letter: ");
		String sub = st.nextLine();
		int index = input.indexOf(sub);
		System.out.println(index);
	}
}
