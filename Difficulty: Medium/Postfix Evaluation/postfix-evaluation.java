class Solution {
    public int evaluate(String[] arr) {
        Stack<Integer> stack=new Stack<>();
        int i=0;
        List<String> opr=new ArrayList<>();
        opr.add("+");
        opr.add("-");
        opr.add("*");
        opr.add("/");
        while(i<arr.length){
            if(opr.contains(arr[i])){
                if(stack.isEmpty()) return -1;
                int a=stack.pop();
                int b=stack.pop();
                int res;
                if(arr[i].equals("+")){
                    res=b+a;
                    stack.push(res);
                }else if(arr[i].equals("-")){
                    res=b-a;
                    stack.push(res);
                }else if(arr[i].equals("*")){
                    res=b*a;
                    stack.push(res);
                }else if(arr[i].equals("/")){
                    res=b/a;
                    stack.push(res);
                }
            }else{
                int t=Integer.parseInt(arr[i]);
                stack.push(t);
            }
            i++;
        }
        if(stack.isEmpty()) return -1;
        return stack.pop();
        
    }
}