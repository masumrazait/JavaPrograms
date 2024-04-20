package coding_19;

public class ReverseString {

	public static void main(String[] args) {
		String input = "jahaj";
		String rev = " ";
		int len = input.length();
		String original=input;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		if(original.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrom "+original);
		}else {
			System.out.println("String is not palindrom :"+rev);
		}
	}
}
