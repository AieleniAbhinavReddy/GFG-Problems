// User function Template for Java

class Solution {
    static int map(int n, String keys[], int arr[], String s) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(keys[i],arr[i]);
        }
        if(!map.containsKey(s)) return -1;
        return map.get(s);
    }
}