package javaProgramForTesterFeb;

public class ReverNumber {

	public static void main(String[] args) {
		int num = 12321;
		int rev = 0;
		int or = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (or == rev) {
			System.out.println(or + " num is palindrom");
		} else {
			System.out.println(rev + " num is not palindrom");
		}
	}

}
