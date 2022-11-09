class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int n = 0;
        for(int i = 1; i < a; i++){
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                n += 31;
            else if(i == 4 || i == 6 || i == 9 || i == 11)
                n += 30;
            else if(i == 2)
                n += 29;
        }
        n += b - 1;
        n %= 7;
        System.out.println(n);
        
        switch(n){
            case 0:
                return "FRI";
            case 1:
                return "SAT";
            case 2:
                return "SUN";
            case 3:
                return "MON";
            case 4:
                return "TUE";
            case 5:
                return "WED";
            case 6:
                return "THU";
        }
        return answer;
    }
}