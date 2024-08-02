package August1;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "masum mas  er";
		int count = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
