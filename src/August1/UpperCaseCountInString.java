package August1;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String str = "mRaMum";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
				System.out.println(c);
			}
		}
		System.out.println(count);
	}

}
