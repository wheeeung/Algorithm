import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            boolean prime_number = true;

            if(x == 1)
                continue;

            for(int j = 2; j < x; j++){
                if(x % j == 0){
                    prime_number = false;
                    break;
                }
            }

            if(prime_number)
                cnt++;
        }

        System.out.println(cnt);

    }
}
