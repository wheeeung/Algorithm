
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int i = n; i <= m; i++){
            boolean prime_number = true;

            if(i == 1)
                continue;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    prime_number = false;
                    break;
                }
            }

            if(prime_number){
                sum += i;
                if(min > i)
                    min = i;
            }
        }
        if(sum == 0)
            System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}