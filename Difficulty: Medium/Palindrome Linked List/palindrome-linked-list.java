/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public boolean isPalindrome(Node head) {
        Stack<Integer> st=new Stack<>();
        Node slow=head;
        Node fast=head;
        int len=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            len+=1;
        }
        while(fast!=null && fast.next!=null){
            st.push(slow.data);
            slow=slow.next;
            fast=fast.next.next;
        }
        // System.out.println(len);
        if(len%2 != 0){
            // st.pop();
            slow=slow.next;
        }
        // System.out.println(slow.data+" "+st.peek());
        while(!st.isEmpty() && slow!=null){
            if(st.peek() != slow.data){
                return false;
            }
            slow=slow.next;
            st.pop();
        }
        return true;
    }
}