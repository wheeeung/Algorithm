import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int cnt = 0;

        while(n.length() > 1){
            long sum = 0;
            for(int i = 0; i < n.length(); i++){
                sum += Integer.parseInt(String.valueOf(n.charAt(i)));
            }
            cnt++;
            n = String.valueOf(sum);
        }
        if(Integer.parseInt(String.valueOf(n)) % 3 == 0){
            System.out.println(cnt);
            System.out.println("YES");
        }
        else {
            System.out.println(cnt);
            System.out.println("NO");
        }
    }
}