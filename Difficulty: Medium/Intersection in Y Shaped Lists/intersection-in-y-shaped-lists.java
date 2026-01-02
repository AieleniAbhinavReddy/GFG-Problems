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
    static int getLen(Node head){
        Node curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        return len;
    }
    public Node intersectPoint(Node head1, Node head2) {
        int len1=getLen(head1),len2=getLen(head2);
        int n=Math.abs(len1-len2);
        if(len1==len2){
            Node c1=head1,c2=head2;
            while(c1!=null && c2!=null){
                if(c1==c2) return c1;
                c1=c1.next;
                c2=c2.next;
            }
        }else{
            Node bh=len1>len2? head1:head2;
            Node sh=len1<len2? head1:head2;
            while(n>0 && bh!=null){
                bh=bh.next;
                n-=1;
            }
            while(bh!=null && sh!=null){
                if(bh==sh) return bh;
                bh=bh.next;
                sh=sh.next;
            }
        }
        return null;
    }
}