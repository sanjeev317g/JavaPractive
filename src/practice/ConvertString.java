package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertString {

	static String s;
	
	static int i,j,k,l,m;
	
	static Scanner scanner;
	
	static String ss;
	
	static int index[];
	
	static List<Integer> myList = new ArrayList<Integer>();
	
	static StringBuilder myName, myName1;
	
	static char[] vowels = {'A','E','I','O','U'};
	
	public static void main (String args[]) {
		
		
		scanner = new Scanner(System.in);
		
		System.out.println("Input number of strings :");
		
		String n  = scanner.nextLine();
		System.out.println(n);
		
		System.out.println("Input first String :");
		
		
		s = scanner.nextLine();
		char[] c = s.toCharArray();
		//char[] c = {'S','A','N','J','E','E','V','A'};
		System.out.println("Input a second String :");
		
		ss = scanner.nextLine();
		
		char[] cc = ss.toCharArray();
		//char[] cc = {'K','U','M','A','R'};
		
		myName = new StringBuilder(s);
		myName1 = new StringBuilder(ss);
		for(i =0;i<s.length();i++) {
			
			for(j = 0; j< vowels.length;j++) {
				
			 if(c[i] == vowels[j]) {
			//ss = s.replace(c[i], '#');
			//System.out.println(ss);
			//myList.add(i);
			
			myName.setCharAt(i, '#');
			
			}
			
		}	 
		}
		 System.out.println(myName); 
		 
			for(l =0;l<ss.length();l++) {
				
				for(m = 0; m< vowels.length;m++) {
					
				 if(cc[l] == vowels[m]) {
				//ss = s.replace(c[i], '#');
				//System.out.println(ss);
				//myList.add(i);
				
				myName1.setCharAt(l, '#');
				
				}
				
			}	 
			}
			 System.out.println(myName1); 
		 
		 
 	}
}
