/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        if(head==null) return new Node(x);
        int len=0;
        Node curr=head;
        while(curr!=null) {
            len++;
            curr=curr.next;
        }
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(len%2==0){
            // Node temp=prev.next;
            Node newn=new Node(x);
            prev.next=newn;
            newn.next=slow;
        }else{
            Node temp=slow.next;
            Node newn=new Node(x);
            slow.next=newn;
            newn.next=temp;
        }
        return head;
    }
}