package jan2025;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "jahaj";
		String rev = "";
		String orig = str;
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (orig.equalsIgnoreCase(rev)) {
			System.out.println(orig + " palindrom");
		} else {
			System.out.println(rev + " not palindrome");
		}
	}
}