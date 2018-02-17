package encapsulation;

public class Encapsulation {
	
	private static String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNanme(String name) {
		return name;
	}
	
	public static void main (String args[]) {
		Encapsulation encapsulation = new Encapsulation();
		encapsulation.setName("Hedgehoglab");
		System.out.println( encapsulation.getNanme(name));
		
	}

}
