package juneCodingAllProgram;

import java.util.Scanner;

public class WordCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sd.nextLine();
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
