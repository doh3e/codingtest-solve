class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int twoab = 2 * (a * b);
        
        return ab >= twoab ? ab : twoab;
    }
}