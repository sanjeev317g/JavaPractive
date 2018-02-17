package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main (String args[]) {
		
		int n1=0,n2=1,n3;
		System.out.println("Enter a number for fibonacci :");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			n3 = n1+n2;
			n1 =  n2;
			n2 = n3;
			System.out.println(n3);
		}
		
		
	}

}
