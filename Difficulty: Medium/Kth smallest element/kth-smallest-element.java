class Solution {
    public static int kthSmallest(int arr[], int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n:arr){
            pq.offer(n);
        }
        while(k-->1){
            pq.poll();
        }
        return pq.poll();
    }
}
