package rays.com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
	  Queue a = new LinkedList();
	  
	  a.add(11);
	  a.add(22.3);
	  a.add(31);
	  a.add(41);
	  a.add(51);
	
	  //System.out.println(a);
	  //a.peek();
	 //a.poll();
	 // a.offer(60);
	  a.remove(22.3);
	  //a.element();
	  
	  System.out.println(a);
	  
	}

}
