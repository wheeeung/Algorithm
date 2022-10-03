class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] ans = new int[1];
            ans[0] = -1;
            return ans;
        }
        int[] answer = new int[arr.length - 1];
        int min = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                min = arr[i];
            }
            
            if(arr[i] < min)
                min = arr[i];
        }
        
        for(int i = 0, j = 0; i < arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[j] = arr[i];
            j++;
        }
        return answer;
    }
}