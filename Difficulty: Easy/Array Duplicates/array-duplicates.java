class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1) break;
            if(arr[i]==arr[i+1]) list.add(arr[i]);
        }
        return list;
    }
}