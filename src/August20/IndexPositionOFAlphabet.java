package August20;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		String sc = "masumrazamaharani";
		char index = 'm';
		System.out.print("Index positions of '" + index + "' are: ");
		for (int i = 0; i < sc.length(); i++) {
			if (sc.charAt(i) == index) {
				System.out.print(i + " ");
			}
		}
	}
}