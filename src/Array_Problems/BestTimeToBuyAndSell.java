package Array_Problems;

public class BestTimeToBuyAndSell {
    public int maxProfit1(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
            maxprofit = Math.max(maxprofit, prices[i] - minprice);
        }
        return maxprofit;
    }

    public int maxProfit2(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSell solution = new BestTimeToBuyAndSell();
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Single transaction profit: " + solution.maxProfit1(prices1));
        System.out.println("Multiple transactions profit: " + solution.maxProfit2(prices1));
        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println("\nSingle transaction profit: " + solution.maxProfit1(prices2));
        System.out.println("Multiple transactions profit: " + solution.maxProfit2(prices2));
        int[] prices3 = {7, 6, 4, 3, 1};
        System.out.println("\nSingle transaction profit: " + solution.maxProfit1(prices3));
        System.out.println("Multiple transactions profit: " + solution.maxProfit2(prices3));
    }
}