class Solution {
    public int solution(int n) {
        long[] pibo = new long[n + 1];
        pibo[0] = 0;
        pibo[1] = 1;
        for(int i = 2; i <= n; i++){
            pibo[i] = (pibo[i - 1] + pibo[i - 2]) % 1234567; 
        }
        return (int)pibo[n];
    }
}