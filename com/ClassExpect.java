package rays.com;

public class ClassExpect {

	public static void main(String[] args) {
		try {
				
	int i = 100/10;
	System.out.println("i:"+i);
	
		} catch (Exception e) {
			System.out.println("after artihmetic exception");
			
		}	finally  {
			
		System.exit(0);
		System.out.println("right answer");
		}
		

	}

}
