class MyStack {
    int top=0;
    int[] oper=new int[101];
    public void push(int x) {
        oper[top++]=x;
    }

    public int pop() {
        if(top==0) return -1;
        int peek=oper[--top];
        return peek;
    }
}
