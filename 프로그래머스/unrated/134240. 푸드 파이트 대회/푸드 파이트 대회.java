class Solution {
    public String solution(int[] food) {
        String answer = "";
        String s = "";
        for(int i = 1; i < food.length; i++){
            int tmp = food[i] / 2;
            if(tmp == 0)
                continue;
            else{
                for(int j = 0; j < tmp; j++)
                    s += i + "";
            }
        }
        
        answer = s + "0";
        
        String[] sArr = s.split("");
        for(int i = sArr.length - 1; i >= 0; i--){
            answer += sArr[i];
        }
        return answer;
    }
}