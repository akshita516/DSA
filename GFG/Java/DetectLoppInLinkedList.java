

// User function template for JAVA
/*QUESTION: 
You are given the head of a singly linked list. Your task is to determine if the linked list contains a loop. A loop exists in a linked list if the next pointer of the last node points to any other node in the list (including itself), rather than being null.

Custom Input format:
A head of a singly linked list and a pos (1-based index) which denotes the position of the node to which the last node points to. If pos = 0, it means the last node points to null, indicating there is no loop.
*/


/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
        // Add code here
        HashSet<Node> hashSet= new HashSet<>();
        Node startNode=head;
        Node temp=head;
        while(temp!=null){
            if(hashSet.contains(temp))
                return true;
            hashSet.add(temp);
            temp=temp.next;
        }
        return false;
    }
}