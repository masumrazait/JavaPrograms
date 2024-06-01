package javaCodeForTester;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jahajs";
		int len = str.length();
		String rev = "";
		String or = str;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (or.equalsIgnoreCase(rev)) {
			System.out.println("string is palndrom " + or);
		} else {
			System.out.println("string is not palndrom " + rev);
		}
	}
}
