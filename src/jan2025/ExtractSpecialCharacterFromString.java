package jan2025;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		String str = "M23y4#$ n$%a^m^e @#%32is#adajs#)-ds*&^";
		String org = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(org);
		System.out.println(org.length());
	}
}
