import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> arr = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int todayInt = getDayCount(today);
        

        for(int i = 0; i < terms.length; i++){
            String[] sArr = terms[i].split(" ");
            map.put(sArr[0], Integer.parseInt(sArr[1]));
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] sArr = privacies[i].split(" ");
            
            if(getDayCount(sArr[0]) + (map.get(sArr[1]) * 28) <= todayInt)
                arr.add(i + 1);
                
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int getDayCount(String today){
        String[] days = today.split("\\.");
        int year = Integer.parseInt(days[0]);
        int mon = Integer.parseInt(days[1]);
        int day = Integer.parseInt(days[2]);
        return (year * 12 * 28) + (mon * 28) + day;
    }

}