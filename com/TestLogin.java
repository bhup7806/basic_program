package rays.com;

public class TestLogin extends Exception {


	public static void main(String[] args) {
	try {
		auth("vijay");
	} catch(LoginException exp) {
		
		System.out.println("invalid user/ id password");
			
		}
}
	private static void auth(String Login) throws LoginException {
     if(!"admin".equals(Login)) {
    	 LoginException e = new LoginException();
    	  throw e;
    	 
		
     }

	}
}
