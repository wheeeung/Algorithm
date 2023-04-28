import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i : nums)
            set.add(i);
        
        if(set.size() > answer)
            return answer;
        else 
            return set.size();
    }
}