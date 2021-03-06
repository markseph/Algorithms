import java.util.HashMap;

//	Given an array of integers nums and an integer target,
//	return indices of the two numbers such that they add up to target.
//	You may assume that each input would have exactly one solution,
//	and you may not use the same element twice.
//	You can return the answer in any order.

public class A_Two_Sum {
	public static void main(String[] args) {
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
//		int[] nums = new int[] {3, 2, 4};
//		int target = 6;
//		int[] nums = new int[] {3, 3};
//		int target = 6;
		
		int[] indices = new int[2];
		indices = twoSum(nums, target);
		System.out.println("Because nums[" + indices[0] + "] + nums[" + indices[1] + "] == " + target + ", we return [" + indices[0] + ", " + indices[1] + "].");
	}
	
	//	time complexity: O(n)
	//	space complexity: O(n)
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] indices = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for(int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i) {
				indices[0] = i;
				indices[1] = map.get(complement);
				return indices;
			}
		}
		throw new IllegalArgumentException("No solution.");
	}
	
//	//	time complexity: O(n^2)
//	//	space complexity: O(1)
//	public static int[] twoSum(int[] nums, int target) {
//		int[] indices = new int[2];
//		for(int i = 0; i < nums.length - 1; i++) {
//			for(int j = i + 1; j < nums.length; j++) {
//				if(nums[i] + nums[j] == target) {
//					indices[0] = i;
//					indices[1] = j;
//					return indices;
//				}
//			}
//		}
//		throw new IllegalArgumentException("No solution.");
//	}
}