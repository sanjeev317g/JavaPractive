package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrazyString {
	
	public static void main (String args[]) {
		
		Scanner scanner;
		try {
			
		scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("Input a number");
		int x = scanner.nextInt();
		
		String str;
		String result = "";
		for(int i = 0;i<=x; i++) { 
		
		str = scanner.nextLine();
		boolean str1 = Character.isUpperCase(str.charAt(0));
		if(str1) {
			result += Character.isUpperCase(str.charAt(i+1));
		}
		else
			//result += Character.toLowerCase(str.charAt(i));
		list.add(result);
		
		}
		for(String string : list)
		System.out.println(string);
		}
		catch(Exception e) {
			
		}
		finally {
			
		}
	}

}
