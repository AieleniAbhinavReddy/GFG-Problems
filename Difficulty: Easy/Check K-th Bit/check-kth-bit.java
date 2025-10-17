class CheckBit {
    static boolean checkKthBit(int n, int k) {
        String s=Integer.toBinaryString(n);
        return k<s.length() && s.charAt(s.length()-k-1)=='1';
    }
}