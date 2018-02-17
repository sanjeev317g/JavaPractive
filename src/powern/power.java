package powern;

import java.util.Scanner;

public class power {
	
	public static void main (String args[]) {
		System.out.println(" power ‘n’ :");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int n2 = 1;
		System.out.println("Enter second number :");
		int n1 = scanner.nextInt();
		System.out.println(n+" power "+n1);
		for(int i =1;i<=n1;i++) {
			n2 = n2*n;
			
			System.out.println(n2);
			
		}
		
		
	}

}
