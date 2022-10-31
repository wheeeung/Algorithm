import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> answerArr = new ArrayList<>();
        Map<String,String> Id = new HashMap<>();
        for(int i = 0; i < record.length; i++){
            String[] temp = record[i].split(" ");
            
            if(temp[0].equals("Enter")){           
                Id.put(temp[1],temp[2]);
                answerArr.add(temp[1]+"님이 들어왔습니다.");
            }
            else if(temp[0].equals("Leave")){
                answerArr.add(temp[1]+"님이 나갔습니다.");
            }
            else if(temp[0].equals("Change")){
                Id.replace(temp[1],temp[2]);
            }
        }
        String[] answer=new String[answerArr.size()];      
        for(int i=0;i<answerArr.size();i++){
            int idx=answerArr.get(i).indexOf("님");
            String id=answerArr.get(i).substring(0,idx);
            answer[i]=Id.get(id)+answerArr.get(i).substring(idx);
        }
        return answer;
    }
}