/* Question : 3639. Minimum Time to Activate String
You are given a string s of length n and an integer array order, where order is a permutation of the numbers in the range [0, n - 1].
Starting from time t = 0, replace the character at index order[t] in s with '*' at each time step.
A substring is valid if it contains at least one '*'.
A string is active if the total number of valid substrings is greater than or equal to k.
Return the minimum time t at which the string s becomes active. If it is impossible, return -1.
 */
class Solution {
    public int minTime(String s, int[] order, int k) {
        int n = s.length();
        long total = (long)n * (n + 1) / 2;
        if (k > total) 
            return -1;
        
        int low = 1, high = n, ans = -1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (countValid(n, order, mid) >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans-1;
    }
    
    private long countValid(int n, int[] order, int t) {
        int[] act = new int[t];
        for (int i = 0; i < t; i++) 
            act[i] = order[i];
        Arrays.sort(act);
        
        long gapSum = 0;
        int L = act[0];
        gapSum += (long)L * (L + 1) / 2;
        for (int i = 1; i < t; i++) {
            L = act[i] - act[i - 1] - 1;
            gapSum += (long)L * (L + 1) / 2;
        }
        L = (n - 1) - act[t - 1];
        gapSum += (long)L * (L + 1) / 2;
        
        long total = (long)n * (n + 1) / 2;
        return total - gapSum;
    }
}
