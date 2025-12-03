class Solution {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            q.offer(arr[i]);
        }
        while(k-->1){
            q.poll();
        }
        return q.poll();
    }
}
