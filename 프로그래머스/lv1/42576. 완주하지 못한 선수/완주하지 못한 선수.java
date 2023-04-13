import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> duplication = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String i : participant){
            if(map.containsKey(i)){
                map.replace(i, map.get(i) + 1);
                duplication.add(i);
            }
            else{
                map.put(i, 1);
            }
        }
        
        for(String i : completion){
            map.replace(i, map.get(i) - 1);
        }
        
        for(String i : participant){
            if(map.get(i) == 1){
                answer = i; 
                break;
            }
        }
        
        return answer;
    }
}