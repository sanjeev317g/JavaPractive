package Reverse;

import java.util.Scanner;

public class Reverse {
	
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a String :");
		String str = scanner.nextLine();
		
		StringBuffer stringBuffer = new StringBuffer(str);
		
		System.out.println(stringBuffer.reverse());
	}

}
