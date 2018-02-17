package JewelsandStones;

import java.util.Scanner;

public class JewelsandStones {
	
	public static void main (String args[]) {
		
		String j, s;
		int count=0;
		
		System.out.println("Input first string");
		Scanner scanner = new Scanner(System.in);
	
		
		j = scanner.nextLine();
		
		char[] c = j.toCharArray();

		System.out.println("Input second string");
		
		s = scanner.nextLine();
		
		char[] cc = s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j1=0;j1<cc.length;j1++) {
				if(c[i] == cc[j1]) {
					count++;
					
					
				}
			}
		}
		System.out.println(count);
	}

}
