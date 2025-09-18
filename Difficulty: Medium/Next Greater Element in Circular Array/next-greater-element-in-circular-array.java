class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        int n=arr.length;
        int[] temp=new int[n];
        Arrays.fill(temp,-1);
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n*2;i++){
            int j=i%n;
            while(!s.isEmpty() && arr[s.peek()] < arr[j]){
                temp[s.pop()]=arr[j];
            }
            if(i<n) s.push(i);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:temp){
            res.add(num);
        }
        return res;
    }
}