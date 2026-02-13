// User function Template for Java

class Solution {
    String removeDups(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                sb.append(c);
                map.put(c,i);
            }
        }
        return sb.toString();
    }
}