package javaProgramForTesterFeb;

public class WordCountString {

	public static void main(String[] args) {
		String input="masum raza delhi patna bihar";
		for(char c:input.toCharArray()) {
			if((input.indexOf(c)==' ')&&(input.indexOf(c)!=' ')){
				System.out.println(c);
			}
		}

	}

}
