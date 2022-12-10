import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int crash = 666;
        int cnt = 1;

        while(cnt != n){
            crash++;
            if(String.valueOf(crash).contains("666"))
                cnt++;
        }
        System.out.println(crash);
    }
}
