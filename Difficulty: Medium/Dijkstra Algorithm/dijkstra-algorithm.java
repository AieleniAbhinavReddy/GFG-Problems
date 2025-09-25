class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        //Build adjacency list
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int[] e:edges){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
            adj.get(e[1]).add(new int[]{e[0],e[2]});
        }
        //Initializing the distance array
        int[] dist=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        //Construct a  min heap (distance,node)
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.offer(new int[]{0,src});
        //Dijkstra 
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int u=curr[1],d=curr[0];
            if(d>dist[u]){
                continue;
            }
            for(int[] nei:adj.get(u)){
                int v=nei[0],w=nei[1];
                if(dist[u]+w < dist[v]){
                    dist[v]=dist[u]+w;
                    pq.offer(new int[]{dist[v],v});
                }
            }
        }
        return dist;
    }
}