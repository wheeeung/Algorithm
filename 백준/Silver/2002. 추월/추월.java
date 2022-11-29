import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> carList = new HashMap<>();
        for(int i = 0; i < n; i++){
            String carName = br.readLine();
            carList.put(carName, i);
        }

        int cnt = 0;
        boolean[] check = new boolean[n];
        for(int i = 0; i < n; i++){
            String carName = br.readLine();
            int num = carList.get(carName);
            for(int j = 0; j < num; j++){
                if(!check[j]){
                    cnt++;
                    break;
                }
            }
            check[num] = true;
        }
        System.out.println(cnt);
    }
}
