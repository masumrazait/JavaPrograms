package coding_19;

public class StringReverswe {

	public static void main(String[] args) {
		String input = "jahaj ";
		int len = input.length();
		String rev = "";
		for (int i = len - 1; i>=0; i--) {
			rev = rev + input.charAt(i);
		}
		if(input.equalsIgnoreCase(rev)) {
			System.out.println(rev+" : palindrom");
		}else {
			System.out.println(rev+" : not palindrom");
		}
	}

}
