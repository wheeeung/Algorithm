class Solution {
    public boolean solution(String s) {
        String[] str = s.split("");
        int count = 0;
        
        if(s.length() == 4 || s.length() == 6){
             for(int i = 0; i < 10; i++){
            String to = Integer.toString(i);
            for(int j = 0; j < str.length; j++){
                if(str[j].equals(to))
                    count++;
            }
        }
        if(str.length == count)
            return true;
        else
            return false;
        }else
            return false;
        
    }
}