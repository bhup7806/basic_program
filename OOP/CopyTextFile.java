package InputOutput.OOP;

import java.io.FileReader;
import java.io.FileWriter;

public class CopyTextFile {

	public static void main(String[] args)throws Exception {
		String Source= "D:/p.txt";
		String target = "D:/c.txt";
		FileReader reader= new FileReader(Source);
        FileWriter writer = new FileWriter(target);
        
        int ch= reader.read();
        while(ch!=-1) {
        writer.write(ch);
        ch= reader.read();
        }
        writer.close();
        reader.close();
        
        System.out.println("datacopied");
        
	}

}
