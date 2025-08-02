class Solution {
    int findFrequency(int arr[], int x) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        if(map.containsKey(x)) return map.get(x);
        return 0;
        
    }
}