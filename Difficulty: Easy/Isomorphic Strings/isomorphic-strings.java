class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char t1=s1.charAt(i);
            char t2=s2.charAt(i);
            if(map1.containsKey(t1)){
                if(map1.get(t1) != t2) return false;
            }else{
                map1.put(t1,t2);
            }
        }
        for(int i=0;i<s2.length();i++){
            char t1=s2.charAt(i);
            char t2=s1.charAt(i);
            if(map2.containsKey(t1)){
                if(map2.get(t1) != t2) return false;
            }else{
                map2.put(t1,t2);
            }
        }
        return true;
    }
}