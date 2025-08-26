/* Question: 3638. Maximum Balanced Shipments
You are given an integer array weight of length n, representing the weights of n parcels arranged in a straight line. A shipment is defined as a contiguous subarray of parcels. A shipment is considered balanced if the weight of the last parcel is strictly less than the maximum weight among all parcels in that shipment.
Select a set of non-overlapping, contiguous, balanced shipments such that each parcel appears in at most one shipment (parcels may remain unshipped).
Return the maximum possible number of balanced shipments that can be formed.
*/
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int maximum=Integer.MIN_VALUE, n=weight.length, answer=0;
        for(int i=0;i<n;i++){
            maximum=Math.max(maximum,weight[i]);
            if(weight[i]<maximum){
                maximum=Integer.MIN_VALUE;
                answer++;
            }
        }
        return answer;
    }
}

 
