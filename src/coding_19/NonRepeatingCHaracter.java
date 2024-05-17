package coding_19;

import java.util.Scanner;

public class NonRepeatingCHaracter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the WOrd : ");
		String input = sc.nextLine();
		for (char c : input.toCharArray()) {
			if (input.indexOf(c) != input.lastIndexOf(c)) {
				System.out.println(c);
			}
		}

	}

}
