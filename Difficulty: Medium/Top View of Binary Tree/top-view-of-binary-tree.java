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

class NodeUtil{
    Node node;
    int hd;
    NodeUtil(Node node,int data){
        this.node=node;
        this.hd=data;
    }
}

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null) return list;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<NodeUtil> queue=new LinkedList<>();
        queue.offer(new NodeUtil(root, 0));
        while(!queue.isEmpty()){
            NodeUtil curr=queue.poll();
            Node temp=curr.node;
            int hd=curr.hd;
            if(!map.containsKey(hd)) map.put(hd,temp.data);
            if(temp.left != null) queue.offer(new NodeUtil(temp.left, hd-1));
            if(temp.right != null) queue.offer(new NodeUtil(temp.right, hd+1));
        }
        for(int data:map.values()){
            list.add(data);
        }
        return list;
    }
}