/*node class of the linked list is as:
class Node {
    int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/
// Your task is to complete the function
// function should return the modular Node
// if no such node is present then return -1
class Solution {
    public int modularNode(Node head, int k) {
        int val=-1;
        int i=1;
        Node curr=head;
        while(curr != null){
            if(i%k==0){
                val=curr.data;
            }
            i++;
            curr=curr.next;
        }
        return val;
    }
}