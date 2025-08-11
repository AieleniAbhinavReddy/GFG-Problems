class Solution {
    int firstOccurence(String txt, String pat) {
        if(txt.length()==1) return (txt.equals(pat))? 0:-1;
        int i=0,j=pat.length();
        while(j<=txt.length()){
            String s=txt.substring(i,j);
            if(pat.equals(s)) return i;
            i++;
            j++;
        }
        return -1;
    }
}