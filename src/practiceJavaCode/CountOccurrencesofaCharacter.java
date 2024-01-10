package practiceJavaCode;

import java.util.Scanner;

public class CountOccurrencesofaCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String userinput = sc.nextLine().toLowerCase();
		int originalCount = userinput.length();
		System.out.println("Original string is: " + userinput);
		System.out.println("Original String count is : " + originalCount);
		String replaceString = userinput.replace("a", "");
		int replceCount = replaceString.length();
		System.out.println("Replace string is : " + replaceString);
		System.out.println("replace string count is : " + replceCount);
		int CountOccurrences = originalCount - replceCount;
		System.out.println("originalCount - replceCount is :" + CountOccurrences);
	}
}
