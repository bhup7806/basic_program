package InputOutput.OOP;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import in.co.basic.Data;

public class WritePrimitvedata {

	public static void main(String[] args) throws IOException {
		
	 FileOutputStream out = new FileOutputStream("D:\\text\\abc.dat");
      DataOutputStream out1 = new DataOutputStream(out);
      
      out1.writeInt(1);
      out1.writeBoolean(true);
      out1.writeChar('A');
      out1.writeDouble(1.2);
      out1.close();
      out.close();
       System.out.println("done");
      
	}
}
