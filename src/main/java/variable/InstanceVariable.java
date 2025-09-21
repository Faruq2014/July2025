package variable;

public class InstanceVariable {
	
	String firstName;
	
	

	public static void main(String[] args) {
		
		InstanceVariable iv= new InstanceVariable();
		iv.taher();
		iv.ibrahim();

	}
	
	
	
	public void taher() {
		
		firstName="Taher";
		System.out.println(firstName);
	}
	
	
	
	public void ibrahim() {
		
		firstName="Ibrahim";
		System.out.println(firstName);
		
	}

	
	
	
}
