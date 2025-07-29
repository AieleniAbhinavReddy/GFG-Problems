class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean leader=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    leader=false;
                    break;
                }
            }
            if(leader){
                list.add(arr[i]);
            }
        }
        return list;
    }
}
