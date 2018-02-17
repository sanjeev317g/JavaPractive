package overriding;

public class Test {
	
	Test(){
		System.out.println("");
	}
	
	public static void main (String args[]) {
		B b = new B();
		
		//b.b();
		b.c();
		
		
	}

}
