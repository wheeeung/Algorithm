import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> map = new HashMap<>();
        Map<String, Integer> idx = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++){
            map.put(id_list[i], new HashSet<>());
            idx.put(id_list[i], i);
        }
        
        for(String i : report){
            String[] s = i.split(" ");
            map.get(s[1]).add(s[0]);
        }
        
        for(int i = 0; i < id_list.length; i++){
            HashSet<String> set = map.get(id_list[i]);
            if(set.size() >= k){
                for(String st : set){
                    answer[idx.get(st)]++;
                }
            }
        }
        
        return answer;
    }
}