class Solution {
    public int firstElementKTime(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
            if(map.get(n)>=k) return n;
        }
        return -1;
    }
}