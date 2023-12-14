package javaCodeForTester;

import java.util.Scanner;

public class StringCovertLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the sentence");
		String UserInput=sc.nextLine();
		String ConvertLower=UserInput.toLowerCase();
		System.out.println(ConvertLower);

	}

}
