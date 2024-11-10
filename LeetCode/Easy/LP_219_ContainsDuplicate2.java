package Easy;

import java.util.HashMap;
import java.util.Scanner;

public class LP_219_ContainsDuplicate2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int n = sc.nextInt();
		System.out.println("Enter array Element : ");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value of integer K : ");
		int k = sc.nextInt();
		boolean result = containsNearbyDuplicate(arr,k);
		System.out.println(result);
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		/*
		 * approach1 for (int i = 0; i < nums.length; i++) { for (int j = i + 1; j <
		 * nums.length; j++) { if (nums[i] == nums[j] && i != j) { if (Math.abs(i - j)
		 * <= k) { return true; } } } } return false;
		 */

		// approach 2

		HashMap<Integer, Integer> map = new HashMap();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int prevIndex = map.get(nums[i]);
				if (Math.abs(i - prevIndex) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}
}
