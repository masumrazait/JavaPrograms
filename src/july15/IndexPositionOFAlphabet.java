package july15;

public class IndexPositionOFAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc = "masumrazamaharani";
		char index = 'm';
		int indexPosition = sc.indexOf(index);
		System.out.print("Index positions of '" + index + "' are: ");
		for (int i = 0; i < sc.length(); i++) {
			if (sc.charAt(i) == index) {
				System.out.print(i + " ");
			}
		}
	}
}
