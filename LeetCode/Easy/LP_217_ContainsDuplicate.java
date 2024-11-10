package Easy;

import java.util.HashSet;
import java.util.Scanner;

public class LP_217_ContainsDuplicate {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter array Element : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		boolean result = containsDuplicate(arr);
		System.out.println(result);
	}
	    public static boolean containsDuplicate(int[] nums) {

	        // approach 1 brute force - not good TIME LIMIT EXCEED error 
	      /*  for(int i=0; i<nums.length;i++) {
	            for( int j= i+1; j<nums.length;j++) {
	                if(nums[i] == nums[j]) {
	                    return true;
	                }

	            }
	        }
	        return false; */

	    // approach 2
	     /*   Arrays.sort(nums);
	        for(int i=0;i<nums.length-1;i++) {
	            if(nums[i] == nums[i+1]) {
	                return true;
	            }
	        }
	        return false; */

	    // approach 
	     HashSet<Integer> numbers = new HashSet<>();
	     for(int i=0;i<nums.length;i++) {
	        if(numbers.contains(nums[i])) {
	            return true;
	        }
	        numbers.add(nums[i]);
	     }
	     return false;
	    }
	}
