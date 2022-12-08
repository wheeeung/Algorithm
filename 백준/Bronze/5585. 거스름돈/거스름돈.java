
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //백준 5585
        Scanner sc = new Scanner(System.in);
        int n = 1000 - sc.nextInt();
        int cnt = 0;
        int[] coin = {500, 100, 50, 10, 5, 1};
        for (int i : coin) {
            if (n / i != 0) {
                cnt += n / i;
                n %= i;
            }
        }
        System.out.println(cnt);

    }
}
