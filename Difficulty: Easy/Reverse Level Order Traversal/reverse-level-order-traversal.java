/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Tree {
    public ArrayList<Integer> reverseLevelOrder(Node root) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            while(size-->0){
                Node curr=queue.poll();
                list.add(curr.data);
                if(curr.left != null) queue.add(curr.left);
                if(curr.right != null) queue.add(curr.right);
            }
            ans.add(list);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=ans.size()-1;i>=0;i--){
            for(int n:ans.get(i)){
                list.add(n);
            }
        }
        return list;
    }
}