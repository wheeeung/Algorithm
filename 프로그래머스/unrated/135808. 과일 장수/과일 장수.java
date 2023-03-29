import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int answer = 0;
        for(int i = 0; i < score.length; i += m){
            if(i + m - 1 < score.length)
                answer += arr[i + m - 1] * m;
        }
        return answer;
    }
}