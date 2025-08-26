/* Question : 3637. Trionic Array I
You are given an integer array nums of length n.
An array is trionic if there exist indices 0 < p < q < n − 1 such that:
nums[0...p] is strictly increasing,
nums[p...q] is strictly decreasing,
nums[q...n − 1] is strictly increasing.
Return true if nums is trionic, otherwise return false.
*/
class Solution {
    public boolean isTrionic(int[] arr) {
        int n = arr.length;
        if (n < 3) return false;

        int i = 1;

        // First Increasing
        boolean increasing1 = false;
        while (i < n && arr[i] > arr[i - 1]) {
            i++;
            increasing1 = true;
        }

        // Middle Decreasing
        boolean decreasing = false;
        while (i < n && arr[i] < arr[i - 1]) {
            i++;
            decreasing = true;
        }

        // Final Increasing
        boolean increasing2 = false;
        while (i < n && arr[i] > arr[i - 1]) {
            i++;
            increasing2 = true;
        }

        // Final check
        return (i == n && increasing1 && decreasing && increasing2);
    }
}
