package coding_19;

public class RemoveSpacailCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "fsafs332@sgdsg@fbdfb@m#a$s%u#m  #R@a*z)a";
		String Replace = input.replaceAll("[^a-zA-Z]", "");
		System.out.println(Replace);
	}

}
