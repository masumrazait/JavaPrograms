package practiceJavaCode;

public class CountOccurrencesofaCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "Rahul eat mangos when he was hungry";
		int OriginalCount = inputString.length();
		System.out.println(inputString);

		String replaceString = inputString.replace("a", "");
		int ReplaceCount = replaceString.length();
		System.out.println(replaceString);

		int count = OriginalCount - ReplaceCount;
		System.out.println(count);

	}

}
