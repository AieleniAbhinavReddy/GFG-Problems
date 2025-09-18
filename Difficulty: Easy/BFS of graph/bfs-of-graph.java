class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        while(!q.isEmpty()){
            int curr=q.poll();
            if(!res.contains(curr)) res.add(curr);
            else continue;
            for(int num:adj.get(curr)){
                if(!res.contains(num)){
                    q.offer(num);
                }
            }
        }
        return res;
    }
}