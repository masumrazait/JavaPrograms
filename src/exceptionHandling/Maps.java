package exceptionHandling;

import java.util.HashSet;
import java.util.Iterator;

public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set=new HashSet<>();
		set.add("Ravi");
		set.add("Raji");
		set.add("Ranjit");
		set.add("Raju");
		set.add("Ramesh");
		Iterator name = set.iterator();
		while (name.hasNext()) {
			System.out.println(name.next());
		}
	}

}
