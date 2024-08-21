package August20;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String str = "masu#5646um@%z1ra{};raza";
		String rep = str.replaceAll("[^a-z]", "");
		System.out.println(rep);
	}
}
