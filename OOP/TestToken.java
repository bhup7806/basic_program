package InputOutput.OOP;

import java.util.StringTokenizer;

public class TestToken {

	public static void main(String[] args) {
	
		String str= "This is Java,Java is Object Oriented Language,Java is guarantee for job";
		
		
	       StringTokenizer str1 = new StringTokenizer(str,",");
	       String token = null;
	       
	       while(str1.hasMoreElements()){
	       token= str1.nextToken();
	       System.out.println("Token is:"+token);

	}

}
}