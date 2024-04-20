package coding_19;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="masum raza";
		int count=1;
		for(int i=0;i<input.length()-1;i++) {
			if((input.charAt(i)==' ')&&(input.charAt(i+1)!=' ')){
			count++;	
			}
		}
		System.out.println(count);
	}

}
