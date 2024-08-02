package August1;

public class Paramid {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row - 1; j++) {
				System.out.println(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
		}
		System.out.print(" ");
	}

}
