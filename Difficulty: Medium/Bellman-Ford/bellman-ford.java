// User function Template for Java

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        int inf=100000000;
        int[] dist=new int[V];
        Arrays.fill(dist,inf);
        dist[src]=0;//[0,inf,inf,inf,inf]
        for(int i=0;i<V-1;i++){
            for(int[] e:edges){//edges[][] = [[1, 3, 2], [4, 3, -1], [2, 4, 1], [1, 2, 1], [0, 1, 5]]
                int u=e[0],v=e[1],w=e[2];
                if(dist[u]!=inf && dist[u]+w <dist[v]){
                    dist[v]=dist[u]+w;
                }
            }
        }
        //Check for negative weight cycles
        for(int[] e:edges){
            int u=e[0],v=e[1],w=e[2];
            if(dist[u]!=inf && dist[u]+w<dist[v]){
                return new int[]{-1};
            }
        }
        return dist;
    }
}
