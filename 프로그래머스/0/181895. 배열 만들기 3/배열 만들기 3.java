import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        ArrayList<Integer> newArr = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0]; // 배열 하나의 시작점
            int b = intervals[i][1]; // 배열 하나의 끝점
            for(int j = a; j <= b; j++) {
                newArr.add(arr[j]);
            }
        }
        
        return newArr.stream().mapToInt(i -> i).toArray();
    }
}