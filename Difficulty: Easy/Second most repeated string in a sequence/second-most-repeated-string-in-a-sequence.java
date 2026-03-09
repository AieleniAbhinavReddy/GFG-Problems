// User function Template for Java

class Solution {
    String secFrequent(String arr[], int N) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int hf=0,shf=0;
        for(int f:map.values()){
            if(f>hf){
                shf=hf;
                hf=f;
            }else if(f>shf && f!=hf){
                shf=f;
            }
        }
        for(String s:map.keySet()){
            if(map.get(s)==shf){
                return s;
            }
        }
        return "";
    }
}