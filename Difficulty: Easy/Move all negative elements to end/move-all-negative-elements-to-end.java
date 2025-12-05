// User function Template for Java

class Solution {
    public void segregateElements(int[] arr) {
        List<Integer> pnums=new ArrayList<>();
        List<Integer> nnums=new ArrayList<>();
        for(int n:arr){
            if(n>=0) pnums.add(n);
            else nnums.add(n);
        }
        int i=0;
        for(int n:pnums){
            arr[i++]=n;
        }
        for(int n:nnums){
            arr[i++]=n;
        }
    }
}