import java.util.Arrays;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        String answer = "";
        Arrays.sort(str, Collections.reverseOrder());
        for(int i = 0; i < str.length; i++){
            answer += str[i];
        }
        return answer;
    }
}