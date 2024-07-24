package capgimini;

public class Sortings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "mas12355@!$%#$|123456|}{{um  }{}{MAS}{UM}{(*&*^&%^%$#ra@#$%za";
		String removedRegularExpression = input.replaceAll("[^a-zA-Z]", "");
		System.out.println(removedRegularExpression);
	}
}
