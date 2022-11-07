import java.util.Scanner;

public class Main {
    static int cnt2 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt1 = 0;

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i < n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            cnt1++;
        }
        fib(n);



        System.out.print(cnt2 + " " + cnt1);

    }

    public static int fib(int n){
        if(n == 1 || n == 2){
            cnt2++;
            return 1;
        }
        else {
            return (fib(n - 1) + fib(n - 2));
        }
    }
}
