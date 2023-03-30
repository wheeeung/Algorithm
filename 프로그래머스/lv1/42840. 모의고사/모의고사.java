import java.util.*;

class Solution {
    public Integer[] solution(int[] answers) {
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int j = 0;
        int k = 0;
        int z = 0;
        
        for(int i = 0; i < answers.length; i++){
            if(j == su1.length)
                j = 0;
            if(k == su2.length)
                k = 0;
            if(z == su3.length)
                z = 0;
            
            if(su1[j] == answers[i]){
                cnt1++;
            }
            if(su2[k] == answers[i]){
                cnt2++;
            }
            if(su3[z] == answers[i]){
                cnt3++;
            }
            j++;
            k++;
            z++;
        }
        
        int max = Math.max(Math.max(cnt1, cnt2), cnt3);
        ArrayList<Integer> arr = new ArrayList<>();
        if(max == cnt1)
            arr.add(1);
        if(max == cnt2)
            arr.add(2);
        if(max == cnt3)
            arr.add(3);
        
        return arr.toArray(new Integer[arr.size()]);
    }
}