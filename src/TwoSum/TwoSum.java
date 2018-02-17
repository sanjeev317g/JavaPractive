package TwoSum;

import java.util.Scanner;

public class TwoSum {
	
	public static int[] main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
	int i=0;
	int j=0;
		
		
		for(i=0;i<=nums.length;i++) {
			for( j=0;j<nums.length-1;j++)
			if(nums[i]+nums[j] == target) {
				
			}
		}
		
		return new int[] {i,j};
		
	}

}
