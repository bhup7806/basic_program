package InputOutput.OOP;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import in.co.basic.Data;

public class ReadPrimitive {

	public static void main(String[] args) throws IOException {
	
		FileInputStream file = new FileInputStream("D:\\text\\new.txt");
		DataInputStream in = new DataInputStream(file);
		
		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readChar());
		System.out.println(in.readDouble());
		in.close();

	}

}
