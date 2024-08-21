package August20;

public class UpperCaseCountInString {

	public static void main(String[] args) {
		String str = "MaSumRazaAbdul";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.println(c);
				count++;
			}
		}
		System.out.println(count);
	}
}
