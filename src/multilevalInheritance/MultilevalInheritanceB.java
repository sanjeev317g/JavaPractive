package multilevalInheritance;

public class MultilevalInheritanceB extends MultilevalInheritanceA{
	
	public void macLaptop() {
		System.out.println("This is a MAC computer");
	}
	
	public void windowsLaptop() {
		System.out.println("This is a WINDOWS computer");
	}
	
	public static void main(String aresg[]) {
		MultilevalInheritanceB MultilevalInheritanceb = new MultilevalInheritanceB();
		MultilevalInheritanceb.windowsLaptop();
	}

}
