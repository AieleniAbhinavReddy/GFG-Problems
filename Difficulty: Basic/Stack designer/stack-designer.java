class Solution {
    public static Stack<Integer> push(int arr[]) {
        Stack<Integer> s=new Stack<>();
        for(int n:arr){
            s.push(n);
        }
        return s;
    }
    public static void pop(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}