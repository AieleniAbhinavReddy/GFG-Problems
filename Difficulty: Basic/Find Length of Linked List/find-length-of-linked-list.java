/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        int len=0;
        Node curr=head;
        while(curr!=null){
            len+=1;
            curr=curr.next;
        }
        return len;
    }
}
/*
Approach :
variable
loop

curr,len
loop = to go to each and every node and count the node for total length
display the output

*/