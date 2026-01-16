// User function Template for Java

class Solution {
    String uncommonChars(String s1, String s2) {
        Set<Character> set=new HashSet<>();
        for(char c:s1.toCharArray()){
            if(s2.indexOf(c)==-1){
                set.add(c);
            }
        }
        for(char c:s2.toCharArray()){
            if(s1.indexOf(c)==-1){
                set.add(c);
            }
        }
        char[] res=new char[set.size()];
        int i=0;
        for(char c:set){
            res[i++]=c;
        }
        Arrays.sort(res);
        return new String(res);
    }
}