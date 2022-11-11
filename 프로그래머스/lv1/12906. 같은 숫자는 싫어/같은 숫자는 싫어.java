import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                arrayList.add(arr[i]);
                continue;
            }
            if(arr[i] != arr[i-1])
                arrayList.add(arr[i]);
        }
        answer = new int[arrayList.size()];
        
        for(int i = 0; i < arrayList.size(); i++){
            answer[i] = arrayList.get(i);
        }
        
        return answer;
    }
}