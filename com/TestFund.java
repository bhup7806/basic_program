package rays.com;

public abstract class TestFund {

	public static void main(String[] args) {
		Account a = new Account();
		
		a.setAccounttype("saving Acccount");
		System.out.println("Acccounttype:"+a.getAccounttype());
		a.setnumber("2381000100");
		System.out.println("Acccount no:"+a.getnumber());
		
		a.setbalance(1500);
		double balance = a.getbalance();
		try {
			transfer(a.withdrawl(700));
		}
		
	catch(InsufficientFundException i){
		 i.getmessage();
	}
	finally {
	    	 System.out.println("");                                    
	    	
		}

	}
           private static void transfer(double fund) throws insufficientFund{
        	   if(!(fund<=0)) {
        		   InsufficientFundException v = new InsufficientFundException();
        		   throw v; {     
        	   }
}}  
