import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(func(arr[i]));
        }

    }
    public static int func(int n){
        int[] arr1 = new int[n + 5];
        arr1[1] = 1;
        arr1[2] = 2;
        arr1[3] = 4;

        for(int i = 4; i <= n; i++){
            arr1[i] = arr1[i - 1] + arr1[i - 2] + arr1[i - 3];
        }
        return arr1[n];
    }
}
