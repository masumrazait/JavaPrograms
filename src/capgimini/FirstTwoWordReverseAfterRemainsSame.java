package capgimini;

public class FirstTwoWordReverseAfterRemainsSame  {
	    public static void main(String[] args) {
	        String str = "masum is mas";
	        String[] words = str.split(" ");
	        words[0] = new StringBuilder(words[0]).reverse().toString();
	        String result = String.join(" ", words);
	        System.out.println(result);
	    }
	}
