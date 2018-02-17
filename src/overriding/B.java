package overriding;

public class B extends A{
	
	B(){
		System.out.println("this is a subclass of ...");
	}
	
	public void b() {
		System.out.println("from child ....");
		
	}
	
	public void c() {
		this.b();;
		super.b();;
	}

}
