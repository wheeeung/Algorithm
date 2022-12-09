
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        //백준 20291
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new TreeMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = br.readLine();
            String key = name.substring(name.indexOf(".") + 1);

            if(map.containsKey(key))
                map.put(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }

        for(String answer : map.keySet()){
            System.out.println(answer + " " + map.get(answer));
        }

    }
}
