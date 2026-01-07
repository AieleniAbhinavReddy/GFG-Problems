/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        Node curr1=head1,curr2=head2;
        while(curr1!=null && curr2!=null){
            if(curr1.data!=curr2.data){
                return false;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        if(curr1!=null || curr2!=null){
            return false;
        }
        return true;
    }
}
/*
Approach:
use two variables to track positions of curr values of two lists
a loop to iterate throught the lists
a condition at last to check if sizes are same
if all these are passed then output is true

*/