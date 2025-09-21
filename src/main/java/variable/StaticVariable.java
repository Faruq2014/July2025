package variable;

public class StaticVariable {
	
	static String lastName="Khan";

	public static void main(String[] args) {
		
		StaticVariable sv= new StaticVariable ();
		sv.taher();
		sv.ibrahim();
	   
	
	
	}
	
	
	
	
	public void taher() {
		System.out.println(lastName);
		
	}
	
	
	
	
	public void ibrahim() {
		System.out.println(lastName);
	}

}
