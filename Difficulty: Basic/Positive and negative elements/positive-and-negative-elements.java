// User function Template for Java

class Solution {
    ArrayList<Integer> arranged(ArrayList<Integer> arr) {
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        for(int n:arr){
            if(n>=0) pos.add(n);
            else neg.add(n);
        }
        int i=0,j=0;
        while(i<arr.size()){
            arr.set(i++,pos.get(j));
            arr.set(i++,neg.get(j++));
        }
        return arr;
    }
}
