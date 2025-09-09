/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public Node insert(Node root, int key) {
        // Base case: if root is null, create and return a new node
        if (root == null) {
            return new Node(key);
        }

        // If key already exists, return the tree as is
        if (root.data == key) {
            return root;
        }

        // Recurse down the tree
        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        // Return unchanged root pointer
        return root;
    }
}
