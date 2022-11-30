
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //백준 1629번
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(func(a, b, c));
    }

    static long func(int a, int b, int c) {
        if (b == 0) {
            return 1;
        }
        long n = func(a, b/2, c);
        if(b % 2 == 0)
            return n * n % c;
        else
            return (n * n % c) * a % c;
    }
}