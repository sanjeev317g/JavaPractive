package Mostfrequentwordinanarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrequentWord {
	
	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input number of words you input");
		

		
		int str1 = scanner.nextInt();
		int array[] = new int[str1];
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<str1;i++) {
			String str2 = scanner.nextLine();
			list.add(str2);
		}
		
		for(String str3: list)
			System.out.println(str3);
		
		
		for(int i=0;i<list.size();i++) {
			
			for(int j=0;j<list.size();j++)
			{
			if(list.get(i).equals(list.get(j)))
					{
				//System.out.println(list.get(j));
				
				array[i]++;
					}
			else
				;
		}
		}
		
		for(int arrays : array)
			System.out.println("array count" + arrays);
		//System.out.println("count :" + count);
		
		int tempp;
		
		for(int i=0;i<array.length-1;i++) {
			
			for(int j=0;j<array.length-i-1;j++) {
				
				if(array[j] > array[j+1]) {
					System.out.println(list.get(j)+"::"+array[j]);
				}
				
			}
		}
		scanner.close();
	}

}
