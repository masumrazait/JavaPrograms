package practiceJavaCode;

public class ReverseAstringWithoutUsingStringInbuiltFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name="AmericaAfricaIndia";
		StringBuilder Name2= new StringBuilder();
		Name2.append(Name);
		Name2=Name2.reverse(); // used string builder to reverse
		System.out.println(Name2);

	}

}
