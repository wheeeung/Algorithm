class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            int sum = 0;
            int tmp = i;
            while(sum < n){
                sum+=tmp;
                tmp++;
                if(sum == n)
                    answer++;
            }
        }
        return answer;
    }
}