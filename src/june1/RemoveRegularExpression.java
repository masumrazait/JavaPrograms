package june1;

public class RemoveRegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "masum raza 13@ 3@163#raza";
		String replece = str.replaceAll("[^a-z]", "");
		System.out.println(replece);
	}
}
