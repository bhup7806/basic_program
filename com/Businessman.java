package rays.com;

public class Businessman implements Richman, Socialworker {

	@Override
	public void helptoOthers() {
	System.out.println("helptoother");
		
	}

	@Override
	public void earnmoney() {
	System.out.println("earnmoney");
		
	}

	@Override
	public void donation() {
	System.out.println("donation");
		
	}

	@Override
	public void party() {
	System.out.println("party");
		
	}
	  public static void main(String[]args) {
		  Richman rm = new Businessman();
		  Socialworker sw = new Businessman();
		  Businessman bm = new Businessman();
		  
		  
		  rm.earnmoney();
		  rm.donation();
		  rm.party();
		  
		sw.helptoOthers();
		  
	  }
		  
}


