package Factorial;

import java.util.Scanner;

public class Factorial {
	
	public static void main (String srgs[]) {
		
		System.out.println("Factorial of a number : ");
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
	
		int factorial= 1;
	
		for(int i = 1 ;i<=n; i++) {
		factorial = factorial*i;
		
		}
		System.out.println(factorial);
	}

}
