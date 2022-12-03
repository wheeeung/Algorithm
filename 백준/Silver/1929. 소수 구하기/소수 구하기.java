import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //백준 1929번
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean arr[] = new boolean[n + 1];
        arr[0] = arr[1] = true;

        int sqrt = (int) Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            for(int j = 2; j <= n/i; j++){
                if(!arr[i * j]) {
                    arr[i * j] = true;
                }
            }
        }

        for(int i = m; i <= n; i++){
            if(!arr[i])
                System.out.println(i);
        }

    }
}
