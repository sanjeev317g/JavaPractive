package abstraction;

public class TestBank {
	
	public static void main (String  args[]) {
		Bank b;
		b= new SBI();
		System.out.println(b.getrateOFintrest());
		
		b = new HDFC();
		System.out.println(b.getrateOFintrest());
	}

}
