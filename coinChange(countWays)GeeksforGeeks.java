Given an integer array coins[ ] representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations 
  from coins[ ].  
Note: Assume that you have an infinite supply of each type of coin. And you can use any coin as many times as you want.

Examples:

Input: coins = [1, 2, 3], sum = 4
Output: 4
Explanation: Four Possible ways are: {1,1,1,1},{1,1,2},{2,2},{1,3}.
Input: coins = {2,5,3,6}, sum = 10
Output: 5
Explanation: Five Possible ways are: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}.
Expected Time Complexity: O(sum*N)
Expected Auxiliary Space: O(sum)

Constraints:
1 <= sum, n, coins[i] <= 10^3
solution: 
class Solution {
    public long count(int coins[], int sum) {
        // code here.
        long[] dp = new long[sum+1];
        dp[0] = 1;
        for (int coin:coins){
            for(int j = coin; j<=sum;j++){
                dp[j] += dp[j-coin];
            }
        }
        return dp[sum];
    }
}
