import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i ++) {
            String str = Integer.toString(i);
            boolean isAdd = true;
            for(char c : str.toCharArray()) {
                isAdd = (c == '0' || c == '5') ? true : false;
                if(!isAdd) {
                    break;
                }
            }
            if(isAdd){
                answer.add(i);
            }
        }
        
        if(answer.isEmpty()) {
            answer.add(-1);
        }
        
        return answer;
    }
}