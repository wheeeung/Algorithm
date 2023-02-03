import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int m = n;
        int count = 0;

        while(true){
            m = ((m % 10) * 10) + (((m % 10) + (m / 10)) % 10);

            count++;
            if(m == n)
                break;
        }
        System.out.println(count);
    }
}
