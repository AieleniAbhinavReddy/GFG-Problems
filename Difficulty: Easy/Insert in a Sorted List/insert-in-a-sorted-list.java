/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/

// sortedInsert method should return the head of the modified linked list.
class Solution {
    Node sortedInsert(Node head, int key) {
        Node n=new Node(key);
        if(head==null) return n;
        if(head.data >= key){
            n.next=head;
            return n;
        }
        Node curr=head;
        while(curr.next!=null){
            if(curr.next.data>n.data){
                Node t=curr.next;
                curr.next=n;
                n.next=t;
                return head;
            }
            curr=curr.next;
        }
        curr.next=n;
        return head;
    }
}