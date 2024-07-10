package julyAllCode;

public class RemoveSpecialCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String re = "mas@23434@!#!$$%um242432@!!@{}";
		String sp = re.replaceAll("[^a-z]", "");
		System.out.println("Special charater is " + sp);
	}
}
