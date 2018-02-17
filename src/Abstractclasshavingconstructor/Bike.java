package Abstractclasshavingconstructor;

public abstract class Bike {
	
	abstract void run();
	
	Bike(){
		System.out.println("Bike is ready to go");
	}
	
	public void chanageGear() {
		System.out.println("change gear");
	}
	

}
