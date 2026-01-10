class Solution {
    public static void print_divisors(int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                if(i==n/i){//perfect square handling
                    pq.offer(i);
                }else{
                    pq.offer(i);
                    pq.offer(n/i);
                }
            }
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}
