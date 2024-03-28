package javaProgramForTesterFeb;

import java.util.Scanner;

public class CountWhitepace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word and space:");
		String input = sc.nextLine();
		int count = 0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("The whiteSpace is : " + count);
	}
}