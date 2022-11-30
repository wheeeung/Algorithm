
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //백준 1105번
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] l = st.nextToken().split("");
        String[] r = st.nextToken().split("");

        int cnt = 0;
        if(l.length == r.length){
            for(int i = 0; i < l.length; i++){
                if(Objects.equals(l[i], r[i]) && Objects.equals(l[i], "8"))
                    cnt++;
                else if (!Objects.equals(l[i], r[i]))
                    break;
            }
        }
        System.out.println(cnt);
    }
}
