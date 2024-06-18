package june11;

public class EvenLetterPrintFromString {

	public static void main(String[] args) {
		String str = "MasumRaza";
		int count = 0;
		for (int i = 0; i < str.length(); i += 2) {
			System.out.println(str.charAt(i));
			count++;
		}
		System.out.println(count);
	}
}
