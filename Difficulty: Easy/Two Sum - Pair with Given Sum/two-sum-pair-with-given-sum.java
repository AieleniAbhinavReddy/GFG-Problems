class Solution {
    boolean twoSum(int arr[], int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int req=target-arr[i];
            if(map.containsKey(req)){
                return true;
            }
            map.put(arr[i],i);
        }
        return false;
    }
}