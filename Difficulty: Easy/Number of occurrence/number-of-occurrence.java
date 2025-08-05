class Solution {
    int countFreq(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        if(map.containsKey(target)) return map.get(target);
        return 0;
    }
}
