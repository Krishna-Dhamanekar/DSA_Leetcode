/**
 * Problem: Best Time to Buy and Sell Stock
 * 
 * This file contains:
 * 1. Brute Force Approach - O(n^2)
 * 2. Optimized Approach  - O(n)
 */

class Solution {

    /**
     * Brute Force (O(n^2))
     * Try every possible buy and sell pair
     */
    public int maxProfitBruteForce(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            int buy = prices[i];

            for (int j = i + 1; j < prices.length; j++) {
                int sell = prices[j];

                if (sell - buy > max) {
                    max = sell - buy;
                }
            }
        }
        return max;
    }


    /**
     *  Optimized (O(n))
     * Track minimum price and calculate profit in one pass
     */
    public int maxProfitOptimized(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int min = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                int profit = prices[i] - min;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println("Brute Force Profit: " + sol.maxProfitBruteForce(prices));
        System.out.println("Optimized Profit: " + sol.maxProfitOptimized(prices));
    }
}