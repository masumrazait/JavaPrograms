package August20;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String str = "masumrazaumbrela";
		char index = 'm';
		System.out.print("Index positions of '" + index + "' are: ");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == index) {
				System.out.print(i + " ");
			}
		}
	}
}
