/*
class Node
{
    int data ;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public void deleteNode(Node del_node) {
        Node next=del_node.next;
        del_node.data=next.data;
        del_node.next=next.next;
    }
}