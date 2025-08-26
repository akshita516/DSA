/* Question : 735. Asteroid Collision */
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        int n=asteroids.length, remove=0;
        for(int i=0;i<n;i++){
            int curr=asteroids[i];
            boolean first=true;
            while(((curr<0 && !stack.isEmpty() && stack.peek()>=0))){
                if(first)
                    remove++;
                first=false;
                if(!stack.isEmpty())
                    if(Math.abs(stack.peek())<Math.abs(curr))
                        stack.pop();
                    else if(Math.abs(stack.peek())==Math.abs(curr)){
                        curr=Integer.MIN_VALUE;
                        stack.pop();
                        break;
                    }
                    else{
                        curr=Integer.MIN_VALUE;
                        break;
                    }
            }
            if(curr!=Integer.MIN_VALUE)
                stack.push(curr);
        }
        int i=stack.size()-1;
        int[] answer=new int[i+1];
        while(!stack.isEmpty()){
            answer[i]=stack.pop();
            i--;
        }
        return answer;
    }
}
