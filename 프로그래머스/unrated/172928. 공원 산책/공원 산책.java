import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        ArrayList<Integer> arrX = new ArrayList<>();
        ArrayList<Integer> arrY = new ArrayList<>();
        for(int i = 0; i < park.length; i++){
            String[] s = park[i].split("");
            for(int j = 0; j < park[i].length(); j++){
                if(s[j].equals("S")){
                    answer[0] = i;
                    answer[1] = j;
                }
                if(s[j].equals("X")){
                    arrX.add(i);
                    arrY.add(j);
                }
            }
        }
        
        for(int i = 0; i < routes.length; i++){
            String[] s = routes[i].split(" ");
            if(s[0].equals("N")){
                if(answer[0] - Integer.parseInt(s[1]) < 0
                  || !block(arrX, arrY, answer[1], answer[0] - Integer.parseInt(s[1]), answer[1], answer[0]))
                    continue;
                answer[0] -= Integer.parseInt(s[1]);
            }
            else if(s[0].equals("S")){
                if(answer[0] + Integer.parseInt(s[1]) > park.length - 1
                  || !block(arrX, arrY, answer[1], answer[0] + Integer.parseInt(s[1]), answer[1], answer[0]))
                    continue;
                answer[0] += Integer.parseInt(s[1]);
            }
            else if(s[0].equals("E")){
                if(answer[1] + Integer.parseInt(s[1]) > park[0].length() - 1
                  || !block(arrX, arrY, answer[1] + Integer.parseInt(s[1]), answer[0], answer[1], answer[0]))
                    continue;
                answer[1] += Integer.parseInt(s[1]);
            }
            else if(s[0].equals("W")){
                if(answer[1] - Integer.parseInt(s[1]) < 0
                  || !block(arrX, arrY, answer[1] - Integer.parseInt(s[1]), answer[0], answer[1], answer[0]))
                    continue;
                answer[1] -= Integer.parseInt(s[1]);
            }
        }
        return answer;
    }
    
    public boolean block(ArrayList<Integer> arrX, ArrayList<Integer> arrY, int y, int x, int by, int bx){
        for(int i = 0; i < arrX.size(); i++){
            if(arrX.get(i) == x && Math.min(y, by) <= arrY.get(i) && arrY.get(i) <= Math.max(y, by)){
                System.out.println("abcde");
                return false;
            }
            if(arrY.get(i) == y && Math.min(x, bx) <= arrX.get(i) && arrX.get(i)<= Math.max(x, bx)){
                System.out.println("abcde2");
                return false;
            }
        }
        return true;
    }
}