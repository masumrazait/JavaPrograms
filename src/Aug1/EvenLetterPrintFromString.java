package Aug1;

public class EvenLetterPrintFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "masum";
		int count = 0;
		for (int i = 1; i <= str.length() - 1; i += 2) {
			count++;
			System.out.println(str.charAt(i));
		}
		System.out.println(count);
	}
}
