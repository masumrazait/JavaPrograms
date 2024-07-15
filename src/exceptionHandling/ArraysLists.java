package exceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraysLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("Ravi");
		list.add("Raji");
		list.add("Ranjit");
		list.add("Raju");
		list.add("Ramesh");
		Iterator name = list.iterator();
		while (name.hasNext()) {
			System.out.println(name.next());
		}

	}

}
