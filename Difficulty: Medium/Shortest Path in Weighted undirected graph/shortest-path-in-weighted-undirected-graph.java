import java.util.*;

class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //Adjacency List
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            adj.get(e[0]).add(new int[]{e[1], e[2]});
            adj.get(e[1]).add(new int[]{e[0], e[2]});
        }
        //Dijkstra's Algorithm
        int inf = (int) 1e9;
        int[] dist = new int[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(dist, inf);
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        dist[1] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 1});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0];
            int u = cur[1];
            if (d > dist[u]) {
                continue;
            }
            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int w = edge[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    parent[v] = u;
                    pq.offer(new int[]{dist[v], v});
                }
            }
        }
        // If no path exists to node 'n'
        if (dist[n] == inf) {
            return Collections.singletonList(-1);
        }
        // Reconstruct the path from the parent array
        List<Integer> path = new ArrayList<>();
        int node = n;
        while (parent[node] != node) {
            path.add(node);
            node = parent[node];
        }
        path.add(1);
        Collections.reverse(path);
        List<Integer> result = new ArrayList<>();
        result.add(dist[n]);
        result.addAll(path);
        return result;
    }
}