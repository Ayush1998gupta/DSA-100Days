package Medium;

public class BestTimetoBuyandSellStockII {

	//	Recursion

	public static int  maxProfit1(int[] prices) {
		return maxProfit(prices, 0, true);
	}
	public static int maxProfit(int [] prices, int index, boolean buy) {

		if(index==prices.length) {
			return 0;
		}
		int profit;
		if(buy) {
			profit=Math.max((-prices[index]+maxProfit(prices, index+1, false)),
					maxProfit(prices, index+1, true));
		}
		else {
			profit=Math.max((prices[index]+maxProfit(prices, index+1, true)),
					maxProfit(prices, index+1, false));
		}
		return profit;
	}
	
	
//	Simple for loop
	public static int  maxProfit2(int[] prices) {
		int profit=0;
		
		for (int i = 1; i < prices.length; i++) {
			if(prices[i]>prices[i-1]) {
				profit+=prices[i]-prices[i-1];
			}
		}
		return profit;
	}
	

	

}
