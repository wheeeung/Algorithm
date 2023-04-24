import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        ArrayList<Integer> arr = new ArrayList<>();
        int answer = 0;
        int cnt = 0;
        
        Arrays.sort(tangerine);
        for(int i = 0; i < tangerine.length; i++){
            cnt++;
            
            if((i < tangerine.length - 1 && tangerine[i] != tangerine[i+1])
                || (i == tangerine.length - 1 && cnt > 0)){
                arr.add(cnt);
                cnt = 0;
            }
        }
        
        Collections.sort(arr, Collections.reverseOrder());
        
        for(int i : arr){
            k -= i;
            answer++;
            if(k <= 0)
                break;
        }
        return answer;
    }
}