//Back-end complete function Template for Java

class Solution {
    // function to calculate the sum of dependencies in the graph
    int sumOfDependencies(int V, int[][] edges) {
        // code here
        int[] d=new int[V];
        for(int i=0;i<edges.length;i++){
            d[edges[i][0]]++;
        }
        int sum=0;
        for(int n:d) sum+=n;
        return sum;
    }
}