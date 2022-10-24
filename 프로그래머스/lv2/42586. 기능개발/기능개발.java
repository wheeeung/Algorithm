import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        int day = 1;
        for(int i = 0; i < progresses.length; i++){
            while(progresses[i] + (speeds[i] * day) < 100){
                day++;
            }
            q.add(day);
            day = 1;
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        int cnt = 1;
        int now = q.poll();
        
        while(!q.isEmpty()){
            int next = q.poll();
            if(now >= next) cnt++;
            else{
                arr.add(cnt);
                now = next;
                cnt = 1;
            }
        }
        arr.add(cnt);
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}