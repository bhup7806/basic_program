package rays.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		Set s = new LinkedHashSet();
		s.add(25);
		s.add(50);
		s.add(75);
		s.add(100);
		
		System.out.println(s.add(1));
		
		

	}

}
