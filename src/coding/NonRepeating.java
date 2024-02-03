package coding;

import java.util.Scanner;

public class NonRepeating {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the UserInput");
		String UserInput = sc.nextLine();
		for (char c : UserInput.toCharArray()) {
			if (UserInput.indexOf(c) == UserInput.lastIndexOf(c)) {
				System.out.println("Non Repating character: " + c);
			}
		}
	}

}
