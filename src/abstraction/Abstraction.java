package abstraction;

abstract class Abstraction {
	
	int a;
	int b;
	
	public abstract void abc();
	public abstract void abd();
	
	public abstract void abe();
	
	public void lapTopMonitor() {
		System.out.println("It got one Monitor");
	}
	
	public void lapTopKeyboard() {
		System.out.println("It got one keyboard");
		
	}
	
	public void lapTopMousePad() {
		System.out.println("It got one mousePad");
	}

}
