package rays.com;

public class Person {
    protected  String firstName = null;
	protected String  lastName = null;
	protected String Address = null;
	
	public Person() {
		System.out.println(" person default constructor");}
		
		
		public Person(String fn, String ln ) {
			
			firstName = fn;
			lastName = ln;
			
			System.out.println("2 params:"  + firstName+lastName);
		}
		
		public Person(String fn, String ln, String add) {
			
		this(fn,ln);
		Address = add;
			System.out.println(" 3 params:"+ firstName + lastName + Address);
			}
				
			public static void main(String[] args) {
				
				Person s = new Person("bhupendra","patidar", "indore");
			Person S1 = new employee();
						
			}
		}
	
	
	


