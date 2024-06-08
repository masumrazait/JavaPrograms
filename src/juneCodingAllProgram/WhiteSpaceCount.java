package juneCodingAllProgram;

import java.util.Scanner;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
