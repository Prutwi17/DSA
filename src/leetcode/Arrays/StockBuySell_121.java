package leetcode.Arrays;

import java.util.Arrays;

// Greedy Algorithm Approach
public class StockBuySell_121 {
    public static void main(String[] args){
        int [] arr = {1,-2,3,-4,7,8,9};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
