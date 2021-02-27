package InputOutput.OOP;

import java.io.File;

public class TestDirectory {

	public static void main(String[] args) {
		
	 File Directory = new File("D:/");
	
	 String[] list = Directory.list();
	 for(int i =0; i<list.length; i++) {
	 System.out.println(list[i]);
	 //Directory .renameTo(new File("D:\\text"));
	 //Directory.delete();
	// Directory.deleteOnExit();
	 Directory.mkdir();
	 
	//System.out.println("audio");

	}

}}
