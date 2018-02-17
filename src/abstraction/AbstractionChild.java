package abstraction;

public class AbstractionChild extends Abstraction{

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abd() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abe() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String args[]) {
		AbstractionChild abstraction = new AbstractionChild();
		abstraction.lapTopKeyboard();
		abstraction.abc();
		Abstraction ab = new AbstractionChild();
	}

}
