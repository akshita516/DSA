/*QUESTION: 
Given the head of a linked list where nodes can contain values 0s, 1s, and 2s only. Your task is to rearrange the list so that all 0s appear at the beginning, followed by all 1s, and all 2s are placed at the end.
*/


/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        // code here
        int countZeros=0,countOnes=0,countTwos=0;
        Node temp=head;
        while(temp!=null){
            int value=temp.data;
            if(value==0)
                countZeros++;
            else if(value==1)
                countOnes++;
            else
                countTwos++;
            temp=temp.next;
        }
        
        temp=head;
        
        while(countZeros>0){
            temp.data=0;
            countZeros--;
            temp=temp.next;
        }
        while(countOnes>0){
            temp.data=1;
            countOnes--;
            temp=temp.next;
        }
        while(countTwos>0){
            temp.data=2;
            countTwos--;
            temp=temp.next;
        }
        
        return head;
    }
}
