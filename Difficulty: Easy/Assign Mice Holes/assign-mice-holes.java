class Solution {
    public int assignHole(int[] mices, int[] holes) {
        int max=0;
        Arrays.sort(holes);
        Arrays.sort(mices);
        for(int i=0;i<mices.length;i++){
            int temp=Math.abs(mices[i]-holes[i]);
            max=Math.max(max,temp);
        }
        return max;
    }
}