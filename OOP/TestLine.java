package InputOutput.OOP;

import java.io.BufferedReader;
import java.io.FileReader;
public class TestLine {
	public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("D://text/new.txt");
		BufferedReader br = new BufferedReader(reader);
		  String line = br.readLine();
		  while(line!= null) {
			  System.out.println(line);
			  line= br.readLine();
		  }
       
	}	      

}
