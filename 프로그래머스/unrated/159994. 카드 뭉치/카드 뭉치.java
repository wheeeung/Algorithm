class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int j = 0;
        int k = 0;
        for(int i = 0; i < goal.length; i++){
            if(cards1.length > j && cards1[j].equals(goal[i]))
                j++;
            else if(cards2.length > k && cards2[k].equals(goal[i]))
                k++;
            else
                return "No";
        }
        
        return "Yes";
    }
}