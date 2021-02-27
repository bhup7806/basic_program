
package InputOutput.OOP;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import rays.com.employee;

public class TestDeserialization {
	public static void main(String[] args) throws Exception {
		FileInputStream file= new FileInputStream("D:\\text\\ok.ser");
		
		ObjectInputStream in = new ObjectInputStream(file);
		Employee emp= (Employee)in.readObject();
		
	System.out.println(emp.getId());
	System.out.println(emp.getFirstname());
	System.out.println(emp.getLastname());
		System.out.println(emp.getAddress());
		System.out.println(emp.getTempvalue());

	}

}
