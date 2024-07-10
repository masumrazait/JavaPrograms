package julyAllCode;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "MasimR DelhI BasantPur BanglA";
		int count = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
				System.out.println("UperLetter is : " + c);
			}
		}
		System.out.println("Total UperCaseLetter is : " + count);
	}
}
