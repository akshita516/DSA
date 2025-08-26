/*QUESTION:
Given a string s of lowercase English alphabets, your task is to return the maximum number of substrings formed, after possible partitions (probably zero) of s such that no two substrings have a common character.
*/

class Solution {
    public int maxPartitions(String s) {
        // code here
        int n=s.length();
        int[] last=new int[26];
        Arrays.fill(last,-1);
        for(int i=n-1;i>=0;i--)
            if(last[s.charAt(i)-'a']==-1)
                last[s.charAt(i)-'a']=i;
        int partitions=0,maxIndex=-1;
        for(int i=0;i<n;i++){
            maxIndex=Math.max(maxIndex,last[s.charAt(i)-'a']);
            if(maxIndex==i)
                partitions++;
        }
        return partitions;
    }
}