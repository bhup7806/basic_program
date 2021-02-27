package InputOutput.OOP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestExternalizable {
  public static void main(String[] args) throws IOException {
	  
	  FileOutputStream file = new FileOutputStream("D:/text/hy.bat");
	  
	  DataOutputStream out = new DataOutputStream(file);
	  
	  out.writeChar('n');
	  out.writeInt(80);
	  out.writeInt(85);
	  out.writeInt(90);
	  out.writeInt(900);
	  
	  out.close();
	  file.close();
	  
	  System.out.println("success");
	  
	
}
}			