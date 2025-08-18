class Solution {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        int f=arr.length/k,c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>f) c++;
        }
        return c;
    }
}