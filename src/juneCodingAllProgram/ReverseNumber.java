package juneCodingAllProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 1012;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("revres of original number is " + rev);
	}
}
