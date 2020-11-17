import java.util.HashSet;
import java.util.Set;

//	Given an array of integers, find if the array contains any duplicates.
//	Your function should return true if any value appears at least twice in the array,
//	and it should return false if every element is distinct.

public class A_Contains_Duplicate {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 1};
//		int[] nums = new int[] {1, 2, 3, 4};
//		int[] nums = new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
		
		boolean contains = false;
		contains = containsDuplicate(nums);
		System.out.println("Contains Duplicate: " + contains);
	}
	
	//	time complexity: O(n)
	//	space complexity: O(n)
	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		boolean contains = false;
		
		for(int num : nums) {
			if(set.contains(num)) {
				contains = true;
				return contains;
			}
			set.add(num);
		}
		contains = false;
		return contains;
	}
	
//	//	time complexity: O(n^2)
//	//	space complexity: O(1)
//	public static boolean containsDuplicate(int[] nums) {
//		boolean contains = false;
//		for(int i = 0; i < nums.length - 1; i++) {
//			for(int j = i + 1; j < nums.length; j++) {
//				if(nums[i] == nums[j]) {
//					contains = true;
//					return contains;
//				}
//			}
//		}
//		contains = false;
//		return contains;
//	}
}