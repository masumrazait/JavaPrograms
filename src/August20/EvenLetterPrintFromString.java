package August20;

public class EvenLetterPrintFromString {

	public static void main(String[] args) {
		String Str = "masumraza";
		for (int i = 1; i <= Str.length() - 1; i += 2) {
			System.out.println(Str.charAt(i));
		}
	}
}
