class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        int p = 0;
        String tmp = "";
        while(p < arr.length){
            char c = arr[p].charAt(0);
            if(c >= 'a' && c <= 'z'){
                if(c == 'z'){
                    tmp += "0";
                    p += 4;
                } else if(c == 'o'){
                    tmp += "1";
                    p += 3;
                } else if(c == 't'){
                    if(arr[p + 1].equals("w")){
                        tmp += "2";
                        p += 3;
                    } else{
                        tmp += "3";
                        p += 5;
                    }
                } else if(c == 'f'){
                    if(arr[p + 1].equals("o"))
                        tmp += "4";
                    else 
                        tmp += "5";
                    p += 4;
                } else if(c == 's'){
                    if(arr[p + 1].equals("i")){
                        tmp += "6";
                        p += 3;
                    } else {
                        tmp += "7";
                        p += 5;
                    }
                } else if(c == 'e'){
                    tmp += "8";
                    p += 5;
                } else if(c == 'n'){
                    tmp += "9";
                    p += 4;
                }
            } else {
                tmp += arr[p];
                p++;
            }
        }
        answer = Integer.parseInt(tmp);
        return answer;
    }
}