/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    static int length(Node head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
    static Node newHead(Node head,int diff){
        while(diff-->0){
            head=head.next;
        }
        return head;
    }
    static Node getRes(Node h1,Node h2){
        while(h1!=null && h2!=null){
            if(h1==h2) return h1;
            h1=h1.next;
            h2=h2.next;
        }
        return null;
    }
    public Node intersectPoint(Node head1, Node head2) {
        int l1=length(head1);
        int l2=length(head2);
        int diff=Math.abs(l1-l2);
        if(l1>l2){
            head1=newHead(head1,diff);
            return getRes(head1,head2);
        }else if(l2>l1){
            head2=newHead(head2,diff);
            return getRes(head1,head2);
        }
        return getRes(head1,head2);
    }
}