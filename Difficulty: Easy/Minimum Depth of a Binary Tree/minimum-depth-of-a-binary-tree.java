/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    int minDepth(Node root) {
        if(root==null) return 0;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        int depth=1;
        int i=0;
        while(!q.isEmpty()){
            int size=q.size();
            i++;
            for(int j=0;j<size;j++){
                Node curr=q.poll();
                if(curr.left==null&&curr.right==null) return i;
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
            }
        }
        return i;
    }
}