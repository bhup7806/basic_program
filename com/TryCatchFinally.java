package rays.com;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		try {
			try {
				double div = 15/0;
				System.out.println("div:"+div);
			
			} catch ( Exception e) {
				System.out.println("try block");
			
			
		
		}  catch  (Exception e){
		                 try {
	       double div= 15/0;
			System.out.println("div:"+div);
		
			try {
				System.out.println("hyy");
				
			}
			
		                 }  finally {
            	try {
            		double div = 15/0;
            		System.out.println("div:"+div);}
             
                } catch(Exception h) {
            			System.out.println("hy");
            		
                }
             
		
		                 }
	
	
	          }
		     
	
