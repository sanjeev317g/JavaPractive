package Thread;

public class CreateThread extends Thread {
	
	public void run() {
		
		System.out.println("This run method should execute on thread start");
	}
	
	public static void main (String args[]) {
		CreateThread cthread = new CreateThread();
		cthread.start();
	}
	

}
