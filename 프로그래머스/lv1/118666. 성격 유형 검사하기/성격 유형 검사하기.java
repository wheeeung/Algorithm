import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] allServey = {"R", "T", "C", "F", "J", "M", "A", "N"};
        Map<String, Integer> map = new HashMap<>();
        for(String i : allServey){
            map.put(i, 0);
        }
        String answer = "";
        
        for(int i = 0; i < survey.length; i++){
            String[] s = survey[i].split("");
            if(choices[i] / 2 == 2 && choices[i] % 2 == 0)
                continue;
            else if(choices[i] / 2 < 2){
                map.replace(s[0], map.get(s[0]) + 4 - choices[i]);
            } else if(choices[i] / 2 >= 2){
                map.replace(s[1], map.get(s[1]) + choices[i] - 4);
            }
        }
        
        if(map.get("R") >= map.get("T"))
            answer += "R";
        else
            answer += "T";
        
        if(map.get("C") >= map.get("F"))
            answer += "C";
        else
            answer += "F";
        
        if(map.get("J") >= map.get("M"))
            answer += "J";
        else
            answer += "M";
        
        if(map.get("A") >= map.get("N"))
            answer += "A";
        else
            answer += "N";
        
        return answer;
    }
}