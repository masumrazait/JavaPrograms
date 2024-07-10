package julyAllCode;

import java.util.Scanner;

public class RepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String input = sc.nextLine().toLowerCase();
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) != (input.lastIndexOf(c))) {
				System.out.println("repeating character is : " + c);
			}
		}
	}
}
