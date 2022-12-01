import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] arrN;
    public static void main(String[] args) {
        //백준 1920번
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arrN = new int[n];
        for (int i = 0; i < n; i++) {
            arrN[i] = sc.nextInt();
        }
        Arrays.sort(arrN);

        int m = sc.nextInt();
        int a = 0;
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            if(binarySearch(a, 0, arrN.length - 1) > -1)
                System.out.println(1);
            else
                System.out.println(0);
        }

    }
    static int binarySearch(int key, int low, int high){
        int mid;
        while(low <= high){
            mid = (low + high) / 2;
            if(key == arrN[mid])
                return mid;
            else if(key < arrN[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
