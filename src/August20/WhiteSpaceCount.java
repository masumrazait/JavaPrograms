package August20;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		String str = "masu  rax az ad fg asdd  a";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
