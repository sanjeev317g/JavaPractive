package singleInheritance;

public class singleInheritancechild extends SingleInheritance{
	
	public static void main (String args[]) {
		singleInheritancechild singleInheritance = new singleInheritancechild();
		singleInheritance.macLaptop();
		singleInheritance.lapTopKeyboard();
		singleInheritance.lapTopMonitor();
		singleInheritance.lapTopMousePad();
		
	}
	
	public void macLaptop() {
		System.out.println("This is a MAC computer");
	}
	
	public void windowsLaptop() {
		System.out.println("This is a WINDOWS computer");
	}

}
