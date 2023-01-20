import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> arr = new ArrayList();
        int[] answer = new int[score.length];
        for(int i = 0; i < score.length; i++){
            if(i < k - 1){
                arr.add(score[i]);
                arr.sort(Collections.reverseOrder());
                answer[i] = arr.get(arr.size() - 1);
            } else if(i >= k - 1){
                arr.add(score[i]);
                arr.sort(Collections.reverseOrder());
                answer[i] = arr.get(k - 1);
            }
        }
        return answer;
    }
}