package coding_19;

import java.util.Scanner;

public class SpaceCount {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence ");
		String input = sc.nextLine();
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
