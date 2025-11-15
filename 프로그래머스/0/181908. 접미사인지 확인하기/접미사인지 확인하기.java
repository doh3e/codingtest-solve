import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_suffix) {
        
        int n = my_string.length();
        String [] arr = new String[n];
        
        for (int i = 0; i < n; i++){
            arr[i] = my_string.substring(i, n);
        }
        
        return (Arrays.stream(arr).anyMatch(is_suffix::equals))?1:0;
    }
}