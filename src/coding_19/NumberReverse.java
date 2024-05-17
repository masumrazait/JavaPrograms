package coding_19;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12321;
		int rev = 0;
		int orig = num;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (orig == rev) {
			System.out.println(orig + "palindron");
		} else {
			System.out.println(rev + "not palindron");
		}

	}

}
