package javaProgramForTesterFeb;

public class RemoveSpacialCharecterNumberFromString {

	public static void main(String[] args) {
		String sp = "aDEF DFGG BDFFD $ 3 & @ dJF* (#) _+#@qMSDFJHmA ma$$%%";
		String replace = (sp.replaceAll("[^A-Za-z]", ""));
		System.out.println(replace);
	}
}
