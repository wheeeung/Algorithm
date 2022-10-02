class Solution {
    public String solution(String phone_number) {
        StringBuffer sb = new StringBuffer(phone_number);
        String re_num = sb.reverse().toString();
        String[] array = re_num.split("");
        System.out.println(re_num);
        re_num = "";
        for(int i = 0; i < phone_number.length(); i++){
            if(i<4){
                re_num += array[i];
                continue;
            }
            array[i] = "*";
            re_num += array[i];
        }
        StringBuffer sb2 = new StringBuffer(re_num);
        String blind = sb2.reverse().toString();
        System.out.println(blind);
        return blind;
    }
}