// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public static boolean searchLinkedList(Node head, int x) {
        while(head!=null){
            if(head.data==x) return true;
            head=head.next;
        }
        return false;
    }
}