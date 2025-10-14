/*
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

class Tree {
    ArrayList<Integer> Kdistance(Node root, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=0;
        while(!q.isEmpty()){
            if(i==k){
                for(Node n:q){
                    res.add(n.data);
                }
                break;
            }
            int size=q.size();
            int j=0;
            while(j<size){
                Node curr=q.poll();
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                j++;
            }
            i++;
            
        }
        return res;
    }
}