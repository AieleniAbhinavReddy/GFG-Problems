
class Solution {
    public boolean findPair(int[] arr, int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) map.put(arr[i],i);
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]+x) && map.get(arr[i]+x)!=i) return true;
            map.put(arr[i],i);
        }
        return false;
    }
}
