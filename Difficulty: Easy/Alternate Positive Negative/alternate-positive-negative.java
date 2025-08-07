// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int n:arr){
            if(n<0) neg.add(n);
            else pos.add(n);
        }
        int i=0;
        int j=0;
        while(i<pos.size() && j<neg.size()){
            res.add(pos.get(i++));
            res.add(neg.get(j++));
        }
        while(i<pos.size()) res.add(pos.get(i++));
        while(j<neg.size()) res.add(neg.get(j++));
        for(int k=0;k<res.size();k++){
            arr.set(k,res.get(k));
        }
    }
}