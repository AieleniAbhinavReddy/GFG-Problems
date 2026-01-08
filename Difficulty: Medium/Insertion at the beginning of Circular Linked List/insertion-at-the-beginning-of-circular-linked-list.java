/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtBeginning(Node tail, int key) {
        // code here
        Node node=new Node(key);
        Node head=tail.next;
        tail.next=node;
        node.next=head;
        return node;
    }
}