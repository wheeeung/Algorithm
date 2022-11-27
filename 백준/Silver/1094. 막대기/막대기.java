import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int stick = 64;
        int answer = 0;
        while(num > 0){
            if(stick > num)
                stick /= 2;
            else{
                answer++;
                num -= stick;
            }
        }
        System.out.println(answer);
    }
}
