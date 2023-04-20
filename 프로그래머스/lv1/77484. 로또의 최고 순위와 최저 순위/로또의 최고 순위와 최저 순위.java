class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int correct = 0;
        int missing = 0;
        
        for(int i = 0; i < lottos.length; i++){
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == 0){
                    missing++;
                    break;
                }
                if(lottos[i] == win_nums[j]){
                    correct++;
                    break;
                }
            }
        }
        
        int min = correct;
        int max = correct + missing;
        
        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        return answer;
    }
}