import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for(int i = 0; i < priorities.length; i++){
            q.add(priorities[i]);
        }
        
         while (!q.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == q.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    q.poll();
                    answer++;
                }
            }
        }
        return -1;
    }
}