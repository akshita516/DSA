/*QUESTION:
Given an integer array coins[ ] representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ]. 
Note: Assume that you have an infinite supply of each type of coin. Therefore, you can use any coin as many times as you want.
Answers are guaranteed to fit into a 32-bit integer. 
*/

class Solution {
    public int count(int coins[], int amount) {
        int n=coins.length;
        int[] dp=new int[amount+1];
        dp[0]=1;
        
        for(int i=1;i<=n;i++)
            for(int j=coins[i-1];j<=amount;j++){
                    dp[j]+=dp[j-coins[i-1]];
            }
        return dp[amount];
    }
}