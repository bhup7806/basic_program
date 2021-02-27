package InputOutput.OOP;

import java.io.File;
import java.sql.Date;

public class ReadFile1 {

	public static void main(String[] args) {
		File f =  new File("d:/Text/new.txt");
		
		//if(f.exists()) {
      //System.out.println("Name:"+f.getName());
			//System.out.println("Absoloute path:"+f.getAbsolutePath());
			//System.out.println("length:"+f.length()+"bytes long");
			//System.out.println("Is readable"+f.canRead());
			//System.out.println("is writeabldse:"+f.canWrite());
			//System.out.println("is directory:"+f.isDirectory());
			//System.out.println("is file:"+f.isFile());
			System.out.println("last modified at"+new Date(f.lastModified()));
	}

}
