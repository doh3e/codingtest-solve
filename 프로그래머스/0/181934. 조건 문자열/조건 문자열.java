class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        if(n > m) {
            if (ineq.equals(">")) { answer = 1; }
        }
        else if (n < m) {
            if (ineq.equals("<")) { answer = 1; }
        }
        else if (n == m) {
            if (eq.equals("=")) { answer = 1; }
        }
        
        return answer;
    }
}