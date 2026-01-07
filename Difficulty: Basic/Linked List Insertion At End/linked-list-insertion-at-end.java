/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        if(head==null) return new Node(x);
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        Node newNode=new Node(x);
        curr.next=newNode;
        return head;
    }
}
/*
Approach:
variable
loop

variable = curr
loop = to iterate through the list until we reach the end
and at last point the curr to new node

head which they gave us
*/