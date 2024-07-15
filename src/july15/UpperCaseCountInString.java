package july15;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "MaSum";
		int count = 0;
		for (int i = 0; i <= input.length() - 1; i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
				System.out.println("uper character is : " + c);
			}
		}
		System.out.println("Total Upper case is : " + count);
	}
}
