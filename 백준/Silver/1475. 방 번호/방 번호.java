import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[10];

        while(n > 0){
            int i = n % 10;
            n = n / 10;

            if(i == 6)
                arr[9] += 1;
            else
                arr[i] += 1;
        }

        int max = 0;
        for(int i = 0; i < 9; i++){
            max = Math.max(arr[i], max);
        }

        int ans = arr[9] / 2 + arr[9] % 2;
        System.out.println(Math.max(ans, max));
    }
}
