/* Question: 1456. Maximum Number of Vowels in a Substring of Given Length */
class Solution {
    public int maxVowels(String s, int k) {
        int left=0, n=s.length(), vowels=0, answer=0;
        for(int right=0;right<n;right++){
            /*if(right-left+1<=k && isVowel(s.charAt(right)))
                vowels++;*/
            while(right-left+1>k){
                if(isVowel(s.charAt(left)))
                    vowels--;
                left++;
            }
            if(right-left+1<=k && isVowel(s.charAt(right)))
                vowels++;
            //System.out.println(s.substring(left,right+1));
            answer=Math.max(answer,vowels);
        }
        return answer;
    }
    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
