/* Question: 2390. Removing Stars From a String */
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='*')
                stack.pop();
            else
                stack.push(ch);
        }
        String answer=new String();
        while(!stack.isEmpty())
            answer=stack.pop()+answer;
        return answer;
    }
}
