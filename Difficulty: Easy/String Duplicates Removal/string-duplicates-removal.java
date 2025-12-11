// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(sb.indexOf(c+"")==-1){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
