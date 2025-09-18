class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    private static void helper(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res,Stack<Integer> s){
        if(s.isEmpty()) return;
        if(res.size() == adj.size()) return;
        int curr=s.pop();
        res.add(curr);
        for(int num:adj.get(curr)){
            if(!res.contains(num)){
                s.push(num);
                helper(adj,res,s);
            }
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        s.push(0);
        helper(adj,res,s);
        return res;
    }
}