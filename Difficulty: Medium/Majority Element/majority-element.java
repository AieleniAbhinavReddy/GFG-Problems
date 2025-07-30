class Solution {
    int majorityElement(int arr[]) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()>arr.length/2) return entry.getKey();
        } 
        return -1;
    }
}