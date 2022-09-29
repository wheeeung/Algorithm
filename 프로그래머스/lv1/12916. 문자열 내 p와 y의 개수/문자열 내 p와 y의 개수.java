class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int[] a = {0, 0};
        String[] array = s.split("");
        for(int i = 0; i < s.length(); i++){
            if(array[i].equals("p") || array[i].equals("P"))
                a[0]++;
            else if(array[i].equals("y") || array[i].equals("Y"))
                a[1]++;
        }
        if(a[0] == a[1])
            return true;
        else
            return false;
    }
}