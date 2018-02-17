package DigitSum;

import java.util.Scanner;

public class DigitSum {
	
	public static void main (String arsgs[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input a long number to digitsum:");
		String str = scanner.nextLine();
		
		char [] chr = str.toCharArray();
		
		int n = 0;
		for(int i=0;i<chr.length;i++) {
			
			n = n+chr[i];
			System.out.println(chr[i]);
			
		}
		System.out.println(n);
	}

}
