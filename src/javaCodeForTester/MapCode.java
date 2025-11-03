package javaCodeForTester;

import java.util.HashMap;
import java.util.Map;

public class MapCode {

	public static void main(String[] args) {
		Map<String, Integer> NameAge = new HashMap<>();
		NameAge.put("Masum", 27);
		NameAge.put("Raza", 20);
		NameAge.put("Sahi", 23);
		NameAge.put("Rohan", 28);
		NameAge.put("Msm", 29);
		NameAge.put("Mum", 21);
		NameAge.put("B2", 216);
		NameAge.put("B2", 26);
		NameAge.put("Rahu", 24);
		System.out.println("Key-Value pairs in the map:");
		for (Map.Entry<String, Integer> entry : NameAge.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
