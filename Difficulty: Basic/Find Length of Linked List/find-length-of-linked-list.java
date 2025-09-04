/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        int size=0;
        while(head != null){
            size++;
            head=head.next;
        }
        return size;
    }
}