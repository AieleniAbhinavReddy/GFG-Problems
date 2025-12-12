/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    void reorderlist(Node head) {
        if (head == null || head.next == null) {
            return;
        }
        Node p1 = head;// Slow pointer
        Node p2 = head; // Fast pointer
        
        // Use a standard condition to ensure p1 stops exactly at the end of the first half.
        while(p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }
        
        // 2. Split and Reverse
        
        // p1.next is the start of the second half (e.g., node 3 for 1->2->3)
        Node head2 = reverse(p1.next); 
        p1.next = null;                 // Detach the two halves (e.g., 1->2->null)
        Node head1 = head;              // Start of the first half

        // 3. Merge (This logic is correct for alternating)
        while (head1 != null && head2 != null) {
            Node next1 = head1.next;
            Node next2 = head2.next;
            
            // Reorder: head1 -> head2 -> next1
            head1.next = head2;
            head2.next = next1;

            // Advance
            head1 = next1; 
            head2 = next2;
        }
    }
}