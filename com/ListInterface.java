package rays.com;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class ListInterface {

	public static void main(String[] args) {
		Vector v = new Vector();
		
      //List L = new ArrayList();
      
      v.add(10);
      v.add(20);
      v.add(30);
      v.add(40);
      v.add(50);
      
      v.subList(1, 3);
      
      System.out.println(v);
      
     
}}