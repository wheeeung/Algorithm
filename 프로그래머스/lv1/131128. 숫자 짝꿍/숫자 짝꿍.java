import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        
        int[] Xarr = new int[10];
        int[] Yarr = new int[10];
        
        for(String i : X.split("")){
            Xarr[Integer.parseInt(i)]++;
        }
        for(String i : Y.split("")){
            Yarr[Integer.parseInt(i)]++;
        }
        
        for(int i = 9; i >= 0; i--){
            while(Xarr[i] > 0 && Yarr[i] > 0){
                sb.append(i);
                Xarr[i]--;
                Yarr[i]--;
            }
        }
        
        if("".equals(sb.toString()))
            return "-1";
        if("0".equals(sb.toString().substring(0,1)))
            return "0";
        return sb.toString();
    }
}