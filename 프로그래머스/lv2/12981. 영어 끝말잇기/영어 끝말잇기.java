import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int[] count = new int[n];
        Map<String, Integer> map = new HashMap<>();
        
        map.put(words[0], 1);
        count[0] += 1;
        int cnt = 1;
        for(int i = 1; i < words.length; i++){
            if(map.containsKey(words[i])){
                answer[0] = cnt + 1;
                answer[1] = count[cnt] + 1;
                return answer;
            }
            System.out.println(words[i].substring(words[i].length() - 1));
            System.out.println(words[i - 1].substring(0,1));
            if(words[i - 1].substring(words[i - 1].length() - 1).equals(words[i].substring(0, 1))){
                map.put(words[i], cnt);
                count[cnt] += 1;
                cnt++;
                if(cnt >= n)
                    cnt -= n;
            } else {
                answer[0] = cnt + 1;
                answer[1] = count[cnt] + 1;
                System.out.println(Arrays.toString(answer));
                return answer;
            }
        }
        return answer;
    }
}