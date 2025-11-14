import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(String str : intStrs) {
            int slStr = Integer.parseInt(str.substring(s, s+l));
            if (slStr <= k) continue;
            else ans.add(slStr);
        }
        
        int[] answer = new int[ans.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }
}