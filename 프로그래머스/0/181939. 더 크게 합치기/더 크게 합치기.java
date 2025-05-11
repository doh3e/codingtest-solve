class Solution {
    public int solution(int a, int b) {
        int aa = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int bb = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
        
        return aa >= bb ? aa : bb;
    }
}