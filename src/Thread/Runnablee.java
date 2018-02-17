package Thread;

public class Runnablee implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This method will execute on starting a thread");
	}
	
	public static void main (String args[]) {
		Runnablee runnbalel = new Runnablee();
		Thread thread = new Thread(runnbalel);
		thread.start();
	}

}
