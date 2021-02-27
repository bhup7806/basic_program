package InputOutput.OOP;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopying {

	public static void main(String[] args) throws Exception {
	 String Source= "D:\\bp\\IMG-20190118-WA0001.jpg";
	 String target= "D:\\bp\\IMG-20180827-WA0001.jpg";
	 FileInputStream reader= new FileInputStream(Source);
	 FileOutputStream writer= new FileOutputStream(target);
	 
	 int ch= reader.read();
	 while(ch!=-1) {
		 writer.write(ch);
		 ch=reader.read();
		 
	 }	 
	 
		writer.close();	 
       reader.close();
       System.out.println("copied");
	}

}
