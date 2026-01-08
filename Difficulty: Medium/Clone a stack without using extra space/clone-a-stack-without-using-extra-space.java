// User function Template for Java

class Solution {
    void clonestack(Stack<Integer> st, Stack<Integer> cloned) {
        if(st.isEmpty()) return;
        int ele=st.pop();
        clonestack(st,cloned);
        cloned.push(ele);
    }
}