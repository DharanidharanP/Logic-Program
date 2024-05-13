package GeeksForGeeks;

public class BuyAndSellStock {

	public static void main(String[] args) {
		int prices[] = {7, 1, 5, 3, 6, 4};
		int len=prices.length;
		 int max_profit = maxProfit(prices,len);
		 System.out.println(max_profit);

	}

	private static int maxProfit(int[] prices, int len) {
		int buy=prices[0]; 
		int max_profit=0;
		for(int i=1;i<len;i++) {
			if(buy >prices[i]) {
				buy=prices[i];
			}
			else if(prices[i] - buy > max_profit) {
				max_profit = prices[i] - buy;
			}
		}
		return max_profit;
	}

}
