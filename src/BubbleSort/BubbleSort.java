package BubbleSort;


import java.util.Scanner;

public class BubbleSort {
	
	public static void main (String args[]) {
	
		Scanner scanner = new Scanner(System.in); 
		
		int temp;
		System.out.println("Input random 10 numbers or more decide how many number you want to input:");
		int n = scanner.nextInt();
		int array[] = new int[n+2];
		
		for(int i =0;i<array.length;i++) {
			System.out.println("Input numbers :");
			int nn = scanner.nextInt();
			array[i] = nn;
			
		}
		
		for(int arr : array)
			System.out.println(arr);
		
		for(int i=0; i<array.length-1;i++) {
			
		for(int j=0;j<array.length-i-1;j++) {
			
			if(array[j] >= array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
			
		}
	}
		System.out.println("partialy sorted ");
		for(int arr : array)
			System.out.println(arr);
		
	}

}
