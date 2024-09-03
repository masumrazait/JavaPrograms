package August20;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence with blank space: ");
		String str = sc.nextLine();
		int count=0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("total blank space is : " + count);
	}
}
