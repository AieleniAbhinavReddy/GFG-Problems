class Solution {
    public String reverseWords(String s) {
        String[] words=s.split("\\.+");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>0;i--){
            if(!words[i].equals(" ")) res.append(words[i]);
            res.append(".");
        }
        res.append(words[0]);
        int n=res.length();
        if(res.charAt(n-1)=='.'){
            res.deleteCharAt(n-1);
        }
        return res.toString();
    }
}
