class Solution {
    public boolean solution(int x) {
        int a = x;
        int num = 0;
        while(x > 0){
            num += x % 10;
            x /= 10;
        }
        if(a % num == 0)
            return true;
        else 
            return false;
    }
}