import java.util.*;
    
class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        int num = n;
        for (int i = 0; i < n; i++) {
            arr.add(num);
            if (num == 1) break;
            else if (num % 2 == 0) num /= 2;
            else num = (3 * num + 1);
        }
    
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}