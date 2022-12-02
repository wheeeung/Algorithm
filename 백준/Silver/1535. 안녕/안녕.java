import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //백준 1535번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] l = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            l[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        int[] j = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            j[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[101];

        for(int i = 1; i < n + 1; i++){
            for(int k = 99; k >= 0; k--){
                int en = l[i] + k;
                if(en < 100)
                    dp[en] = Math.max(dp[en], dp[k] + j[i]);
            }
        }
        System.out.println(dp[99]);
    }
}