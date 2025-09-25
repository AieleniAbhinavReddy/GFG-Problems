class Solution {
    public boolean isCyclic(int V,int[][] edges){
        //build adjacency list
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        //indegree list
        int[] indgree=new int[V];
        for(int[] e:edges){
            int u=e[0],v=e[1];
            adj.get(u).add(v);
            indgree[v]++;
        }
        //kahns algorithm
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indgree[i]==0) q.offer(i);
        }
        int count=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            count++;
            for(int nei:adj.get(curr)){
                indgree[nei]--;
                if(indgree[nei]==0) q.offer(nei);
            }
        }
        return count!=V;
    }
}