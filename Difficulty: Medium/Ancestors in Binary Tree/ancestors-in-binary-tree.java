/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {
    private static ArrayList<Integer> list = new ArrayList<>();
    private boolean findAncestors(Node root,int target){
        if(root==null) return false;
        if(target==root.data) return true;
        if(findAncestors(root.left,target) || findAncestors(root.right,target)){
            list.add(root.data);
            return true;
        }
        return false;
    }
    public ArrayList<Integer> Ancestors(Node root, int target) {
        list.clear();
        findAncestors(root,target);
        return list;
    }
}