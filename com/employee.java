package rays.com;

public class employee extends Person {
	
	private String designation = null;
	
	
	public employee() {
		System.out.println("default employee");
		
	}
	
	public employee( String fn, String ln, String design) {
		
		super(fn, ln);
		designation = design;
		System.out.println("3 params:" + firstName+lastName+designation);
	}

}
