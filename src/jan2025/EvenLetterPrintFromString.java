package jan2025;

public class EvenLetterPrintFromString {

	public static void main(String[] args) {
		String str = "Masumraza";
		for (int i = 1; i <= str.length() - 1; i += 2) {
			System.out.println("even letter is: " + str.charAt(i));
		}
	}
}
