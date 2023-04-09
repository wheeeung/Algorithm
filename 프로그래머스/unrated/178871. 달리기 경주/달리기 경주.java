import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        HashMap<Integer, String> reverseMap= new HashMap<Integer, String>();
        
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i + 1);
            reverseMap.put(i + 1, players[i]);
        }
        
        for(int i = 0; i < callings.length; i++){
            int rank = map.get(callings[i]);
            String player = reverseMap.get(rank - 1);
            
            map.replace(callings[i], rank - 1);
            map.replace(player, rank);
            
            reverseMap.replace(rank, player);
            reverseMap.replace(rank - 1, callings[i]);
        }
        
        for(int i = 0; i < players.length; i++){
            answer[i] = reverseMap.get(i + 1);
        }
        
        return answer;
    }
}