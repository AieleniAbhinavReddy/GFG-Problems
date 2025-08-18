// User function Template for Java

class Solution {
    int findSum(int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            sum+=e.getKey();
        }
        return sum;
    }
}