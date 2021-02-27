package InputOutput.OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) throws Exception {
	
		FileReader reader = new FileReader("D:/scan/scan1.txt");
        Scanner sc = new Scanner(reader);
        while(sc.hasNext()) {
        	//System.out.println(sc.hasNextLine());
        	//System.out.println(sc.hasNextDouble());
        	//System.out.println(sc.hasNextInt());
        	System.out.println(sc.nextDouble());
        	reader.close();
        }
        		
	}

}