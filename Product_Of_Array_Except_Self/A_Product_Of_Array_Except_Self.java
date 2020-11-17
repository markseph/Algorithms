//	Given an array nums of n integers where n > 1,
//	return an array output such that output[i] is equal to the product of all
//	the elements of nums except nums[i].

public class A_Product_Of_Array_Except_Self {
	public static void main(String[] args) {
		int[] nums = new int[] {1, 2, 3, 4};
		int[] prod = new int[nums.length];
		prod = productExceptSelf(nums);
		
		System.out.print("[");
		for(int i = 0; i < prod.length; i++) {
			System.out.print(prod[i]);
			if(i < prod.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	//	time complexity: O(n)
	//	space complexity: O(n)
	public static int[] productExceptSelf(int[] nums) {
		int[] prod = new int[nums.length];
		int[] L = new int[nums.length];
		int[] R = new int[nums.length];
		
		L[0] = 1;
		for(int i = 1; i < nums.length; i++) {
			L[i] = nums[i - 1] * L[i - 1];
		}
		
		R[nums.length - 1] = 1;
		for(int i = nums.length - 2; i >= 0; i--) {
			R[i] = nums[i + 1] * R[i + 1];
		}
		
		for(int i = 0; i < prod.length; i++) {
			prod[i] = L[i] * R[i];
		}
		return prod;
	}
	
//	//	time complexity: O(n^2)
//	//	space complexity: O(1)
//	public static int[] productExceptSelf(int[] nums) {
//		int[] prod = new int[nums.length];
//		int tempProd = 0;
//		for(int i = 0; i < nums.length; i++) {
//			tempProd = 1;
//			for(int j = 0; j < nums.length; j++) {
//				if(i != j) {
//					tempProd *= nums[j];
//				}
//			}
//			prod[i] = tempProd;
//		}
//		return prod;
//	}
}