import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int[] Warr = new int[sizes.length];
        int[] Harr = new int[sizes.length];
        for(int i = 0; i < sizes.length; i++){
            int a = sizes[i][0];
            int b = sizes[i][1];
            
            Warr[i] = Math.max(a,b);
            Harr[i] = Math.min(a,b);
        }
        
        Arrays.sort(Warr);
        Arrays.sort(Harr);
        
        return Warr[sizes.length - 1] * Harr[sizes.length - 1];
    }
}