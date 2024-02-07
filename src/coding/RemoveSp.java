package coding;

import java.util.Scanner;

public class RemoveSp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphanumeric Input with Special Charecter: ");
		String userinput = sc.nextLine();
		String replaceInput = (userinput.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Replace string is : " + replaceInput);

	}

}
