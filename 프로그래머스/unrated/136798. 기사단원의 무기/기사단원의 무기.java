class Solution {
    public int solution(int number, int limit, int power) {
        int[] arr = new int[number + 1];
        int answer = 0;
        for(int i = 1; i <= number; i++){
            int cnt = 0;
            for(int j = 1; j * j <= i; j++){
                if(j * j == i)
                    cnt++;
                else if(i % j == 0)
                    cnt += 2;
            }
            arr[i] = cnt;
        }
        
        for(int i = 1; i <= number; i++){
            if(arr[i] > limit)
                answer += power;
            else
                answer += arr[i];
        }
        return answer;
    }
}