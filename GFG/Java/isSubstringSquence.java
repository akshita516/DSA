/*
  QUESTION: CHECK IF A STRING IS SUBSTRING OF THE OTHER: Given two strings s1 and s2. You have to check that s1 is a subsequence of s2 or not.
Note: A subsequence is a sequence that can be derived from another sequence by deleting some elements without changing the order of the remaining elements.
*/
class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int answer=0, pointer1=0, pointer2=0, m=s1.length(), n=s2.length();
        while(pointer1<m && pointer2<n){
            if(s1.charAt(pointer1)==s2.charAt(pointer2)){
                pointer1++;
                answer++;
            }
            pointer2++;
        }
        //System.out.println(pointer1+" "+pointer2);
        return answer==m;
    }
}
