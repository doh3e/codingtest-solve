import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while(i < arr.length){
            if (stk.isEmpty() || stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i++;
            } else {
                stk.pop();
            }
        }
        
        return stk.stream().mapToInt(j -> j).toArray();
    }
}