package Aug1;

import java.util.HashMap;

public class IntegerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "666233455557777777";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
	}

}
