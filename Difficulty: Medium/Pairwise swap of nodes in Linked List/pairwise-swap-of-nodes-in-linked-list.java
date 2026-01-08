class Solution {
    public Node pairwiseSwap(Node head) {
        if (head == null || head.next == null) return head;
        Node n1 = head;
        Node n2 = head.next;
        while (n2 != null) {
            int temp = n1.data;
            n1.data = n2.data;
            n2.data = temp;
            n1 = n2.next;
            if (n1 != null) {
                n2 = n1.next;
            } else {
                break;
            }
        }
        return head;
    }
}
