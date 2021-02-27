package InputOutput.OOP;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;

public class CopyConCommand {

	public static void main(String[] args) throws IOException {
		
		String target= "D:\\text\\new.txt";
		FileWriter writer = new FileWriter(target);
		PrintWriter PrintWriter= new PrintWriter(writer);
		
		System.out.println("enter");
		InputStreamReader isReader= new InputStreamReader(System.in);
		BufferedReader in= new BufferedReader(isReader);
		
		String line= in.readLine();
		while(!line.equals("quit")) {
			PrintWriter.print(line);
			line=in.readLine();
			
		}
		
		PrintWriter.close();
		isReader.close();
		
		System.out.println("done");

	}

}
