import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a; i++){
            int[] array = new int[10];
            for(int j = 0; j < 10; j++){
                array[j] = sc.nextInt();
            }

            Integer[] tmp = Arrays.stream(array).boxed().toArray(Integer[]::new);
            Arrays.sort(tmp, Comparator.reverseOrder());
            arr[i] = tmp[2];
        }

        for(int i = 0; i < a; i++){
            System.out.println(arr[i]);
        }
    }
}
