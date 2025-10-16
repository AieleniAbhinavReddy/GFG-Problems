/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    int getKthFromLast(Node head, int k) {
        Stack<Integer> s=new Stack<>();
        while(head!=null){
            s.push(head.data);
            head=head.next;
        }
        while(k-->1&&!s.isEmpty()){
            s.pop();
        }
        return s.isEmpty()?-1:s.pop();
    }
}