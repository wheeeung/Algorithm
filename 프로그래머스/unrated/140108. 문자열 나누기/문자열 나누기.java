class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] arr = s.split("");
        int p = 0;
        while(true){
            int[] cnt = new int[2];
            String x = arr[p];
            p++;
            cnt[0]++;
            while(cnt[0] != cnt[1]){
                if(p==arr.length)
                break;
                if(arr[p].equals(x)){
                    p++;
                    cnt[0]++;
                } else {
                    p++;
                    cnt[1]++;
                }
            }
            answer++;
            if(p==arr.length)
                break;
        }
        return answer;
    }
}