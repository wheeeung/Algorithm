class Solution {
    public String solution(String s) {
        int len = s.length();
        String[] array = s.split("");
        String answer = "";
        if(len % 2 == 0){
            len /= 2;
            answer = array[len - 1] + array[len];
        }
        else{
            len /= 2;
            answer = array[len];
        }
        return answer;
    }
}