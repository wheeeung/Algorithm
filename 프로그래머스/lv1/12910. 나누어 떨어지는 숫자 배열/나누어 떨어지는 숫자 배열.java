import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                cnt++;
            }   
        }
        
        int[] ans = new int[cnt];
        
        if(cnt == 0){
            int[] minus = new int[1];
            minus[0] = -1;
            return minus;
        }
        
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                ans[j] = arr[i];
                j++;
            }   
        }
        
        Arrays.sort(ans);
        return ans;
    }
}