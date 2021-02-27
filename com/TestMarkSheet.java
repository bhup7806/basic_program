package rays.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarkSheet {
	public static void main(String[] args) {

		MarkSheet m = new MarkSheet();
		m.setRollNo("1");
		m.setFname("ram");
		m.setLname("jat");
		m.setPhy(80);
		m.setChem(85);
		m.setMaths(90);

		MarkSheet m1 = new MarkSheet();

		m1.setRollNo("2");
		m1.setFname("shyam");
		m1.setLname("jain");
		m1.setPhy(81);
		m1.setChem(82);
		m1.setMaths(91);

		MarkSheet m2 = new MarkSheet();

		m2.setRollNo("3");
		m2.setFname("abhi");
		m2.setLname("karun");
		m2.setPhy(82);
		m2.setChem(87);
		m2.setMaths(92);

		MarkSheet m3 = new MarkSheet();
		m3.setRollNo("4");
		m3.setFname("ashi");
		m3.setLname("pati");
		m3.setPhy(83);
		m3.setChem(88);
		m3.setMaths(93);

		ArrayList<MarkSheet> List = new ArrayList<MarkSheet>();
		List.add(m);

		List.add(m1);
		List.add(m2);
		List.add(m3);

		// System.out.println("vijay");
		// Collections.sort(List);

		// Iterator<MarkSheet> it= List.iterator();
		// while(it.hasNext());
		// MarkSheet o = (MarkSheet)it.next();

		// System.out.println(o.getRollNo()+" " +o.getFname()+" "+o.getLname()+" "
		// +o.getPhy()+" "+o.getChem()+" "+o.getMaths());
		// Collections.sort(List, new OrderByName());
		Collections.sort(List,new OrderByName());
		Iterator<MarkSheet> it = List.iterator();
		while (it.hasNext()) { 
			MarkSheet o = (MarkSheet) it.next();
			System.out.println(o.getRollNo() + " " + o.getFname() + " " + o.getLname() + " " + o.getPhy() + " "
					+ o.getChem() + " " + o.getMaths());
			//System.out.println(o.getFname());
		}
	}

}