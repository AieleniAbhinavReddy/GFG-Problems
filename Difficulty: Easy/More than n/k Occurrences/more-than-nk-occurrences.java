class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0,t=arr.length/k;
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:map.keySet()){
            if(map.get(n)>t) count++;
        }
        return count;
    }
}