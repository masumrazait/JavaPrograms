package juneCodingAllProgram;

import java.util.Scanner;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sd.nextLine();
		int count = 0;
		for (int i = 1; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
