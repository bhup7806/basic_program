package InputOutput.OOP;

import java.io.FileReader;
import java.io.Reader;
public class TestChar {

	public static void main(String[] args) throws Exception {
	FileReader reader = new FileReader("D://text/new.txt");
	  int ch= reader.read();
	  char chr;
	  while(ch!=-1) {
		  chr = (char) ch;
		  System.out.println(chr);
		  ch = reader.read();
		  
		  
	  }
	     
	

	}

}
