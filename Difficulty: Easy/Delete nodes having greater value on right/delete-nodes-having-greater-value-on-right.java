class Solution {
    Node compute(Node head) {
        if (head == null || head.next == null) return head;
        head = reverse(head);
        Node curr = head;
        Node maxNode = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data < maxNode.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
                maxNode = curr;
            }
        }
        return reverse(head);
    }
    private Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}