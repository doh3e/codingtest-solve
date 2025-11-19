class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                int idx = ch - 'A';
                answer[idx]++;
            } else if ('a' <= ch && ch <= 'z') {
                int idx = (ch - 'a') + 26;
                answer[idx]++;
            }
        }

        return answer;
    }
}
