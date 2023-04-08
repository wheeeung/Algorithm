import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < keymap.length; i++){
            String[] s = keymap[i].split("");
            for(int j = 0; j < s.length; j++){
                if(map.containsKey(s[j])){
                    if(map.get(s[j]) > j + 1){
                        map.replace(s[j], j + 1);
                    }
                } else{
                    map.put(s[j], j + 1);
                }
            }
        }
        
        int[] answer = new int[targets.length];
        for(int i = 0; i < targets.length; i++){
            String[] arr = targets[i].split("");
            int cnt = 0;
            for(int j = 0; j < arr.length; j++){
                if(!map.containsKey(arr[j])){
                    cnt = -1;
                    break;
                } else {
                    cnt += map.get(arr[j]);
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}