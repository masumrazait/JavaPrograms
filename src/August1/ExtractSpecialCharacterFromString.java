package August1;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String str = "masumMR#$%^&*(as13(*&^%4456";
		String rm = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(rm);
	}
}
