//	Say you have an array for which the ith element is the price
//	of a given stock on day i.
//	If you were only permitted to complete at most one transaction
//	(i.e., buy one and sell one share of the stock),
//	design an algorithm to find the maximum profit.
//	Note that you cannot sell a stock before you buy one.

public class A_Best_Time_To_Buy_And_Sell_Stock {
	public static void main(String[] args) {
		int[] prices = new int[] {7, 1, 5, 3, 6, 4};
//		int[] prices = new int[] {7, 6, 4, 3, 1};
		
		int maxProfit = 0;
		maxProfit = maxProfit(prices);
		System.out.println("Max Profit: " + maxProfit);
	}
	
	//	time complexity: O(n)
	//	space complexity: O(1)
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < minPrice) {
				minPrice = prices[i];
			}
			else if(prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}
	
//	//	time complexity: O(n^2)
//	//	space complexity: O(1)
//	public static int maxProfit(int[] prices) {
//		int maxProfit = 0;
//		for(int i = 0; i < prices.length - 1; i++) {
//			for(int j = i + 1; j < prices.length; j++) {
//				if(prices[j] - prices[i] > maxProfit) {
//					maxProfit = prices[j] - prices[i];
//				}
//			}
//		}
//		return maxProfit;
//	}
}