package arrays.leetcode;

/**
 * LeetCode 121: Best Time to Buy and Sell Stock
 *
 * Problem:
 * You are given an integer array prices where prices[i] represents
 * the price of a stock on the i-th day.
 *
 * You may choose ONE day to buy and ONE future day to sell.
 * Return the maximum profit you can achieve.
 * If no profit is possible, return 0.
 *
 * Constraints:
 * - 1 <= prices.length <= 10^5
 * - 0 <= prices[i] <= 10^4
 * - You must buy before you sell
 *
 * Approach:
 * - Track the minimum price seen so far (best buying price)
 * - On each day, calculate the profit if the stock is sold today
 * - Update the overall maximum profit
 * - Use a single pass greedy approach
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

public class L121_BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int leastSoFar = Integer.MAX_VALUE;   // Best buying price so far
        int profitIfSoldToday = 0;            // Profit if sold on current day
        int overallProfit = 0;                // Maximum profit achieved

        // Traverse prices day by day
        for (int i = 0; i < prices.length; i++) {

            // Update buying price if a lower price is found
            if (prices[i] < leastSoFar) {
                leastSoFar = prices[i];
            }

            // Calculate profit if sold today
            profitIfSoldToday = prices[i] - leastSoFar;

            // Update overall profit if current profit is better
            if (profitIfSoldToday > overallProfit) {
                overallProfit = profitIfSoldToday;
            }
        }

        return overallProfit;
    }

    // Optional local testing
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}

