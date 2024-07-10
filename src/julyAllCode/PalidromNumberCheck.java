package julyAllCode;

public class PalidromNumberCheck {
	public static void main(String[] args) {
		int num = 123233;
		int rev = 0;
		int original = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (original == rev) {
			System.out.println("num is palindrom " + original);
		} else {
			System.out.println("num is not palidrom " + rev);
		}
	}
}
