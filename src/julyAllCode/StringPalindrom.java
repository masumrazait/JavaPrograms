package julyAllCode;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sc = "masum".toLowerCase();
		String orignal = sc;
		int len = sc.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + sc.charAt(i);
		}
		if (orignal.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrom " + orignal);
		} else {
			System.out.println("String is not palindrom " + rev);
		}
	}

}
