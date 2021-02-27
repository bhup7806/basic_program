package InputOutput.OOP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream file= new FileOutputStream("D:\\text\\ok.ser");
		ObjectOutputStream out= new ObjectOutputStream(file);
		
		Employee em = new Employee(1 ,"bhupendra","patidar","indore","800");
		out.writeObject(em);
		out.close();
		System.out.println("object is successfully persisted");
	}

}
