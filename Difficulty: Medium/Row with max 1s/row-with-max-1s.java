// User function Template for Java

class Solution {
    static int checkOnes(int[] arr){
        int count=0;
        for(int n:arr) if(n==1) count++;
        return count;
    }
    public int rowWithMax1s(int arr[][]) {
        ArrayList<Integer> count=new ArrayList<>();
        for(int[] suba:arr){
            count.add(checkOnes(suba));
        }
        int max=0;
        for(int i=0;i<count.size();i++) if(count.get(i)>count.get(max)) max=i;
        return max;
    }
}