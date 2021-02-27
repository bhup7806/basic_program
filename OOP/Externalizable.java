package InputOutput.OOP;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Externalizable {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fs = new FileInputStream("D:/text/hy.bat");
		DataInputStream in = new DataInputStream(fs);
		
		
		
		System.out.println(in.readChar());
		System.out.println(in.readInt());
		System.out.println(in.readInt());
		System.out.println(in.readInt());
		System.out.println(in.readInt());
		
		in.close();
	}
	
	
}