import java.util.Arrays;
class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("");
        System.out.println(Arrays.toString(arr));
        int[] answer = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            if(i == 0){
                answer[i] = -1;
                continue;
            }
            
            int temp = 0;
            for(int j = i - 1; j >= 0; j--){
                temp++;
                if(arr[i].equals(arr[j]))
                    break;
                else if(j == 0)
                    temp = -1;
            }
            answer[i] = temp;
        }
        return answer;
    }
}