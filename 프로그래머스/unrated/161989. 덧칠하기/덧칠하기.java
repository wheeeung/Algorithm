class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int paint = 0;
        for(int i : section){
            if(paint <= i){
                paint = i + m;
                answer++;
            }
        }
        return answer;
    }
}