// User function Template for Java
class Solution {
    String firstRepChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                return c+"";
            }
            map.put(c,i);
        }
        return "-1";
    }
}