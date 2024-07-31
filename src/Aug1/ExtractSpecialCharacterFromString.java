package Aug1;

public class ExtractSpecialCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ma@$@$S@*@#U999768^&^&M{}}|R98765a876z9a";
		String rp = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(rp);
	}
}
