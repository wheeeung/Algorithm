import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Character[][] arr = new Character[n][m];
        for(int i = 0; i < n; i++){
            String temp = sc.next();
            for(int j = 0; j < m; j++){
                arr[i][j] = temp.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i + 7 < n; i++){
            for(int j = 0; j + 7 < m; j++){
                min = Math.min(min, is(arr, i, j));
            }
        }
        System.out.println(min);
    }

    public static int is(Character[][] arr, int x, int y){
        int count = 0;

        for(int i = x; i < x + 8; i++){
            for(int j = y; j < y + 8; j++){
                //짝수일때
                if(i%2==0){
                    //짝수일때
                    if(j%2==0){
                        if(Objects.equals(arr[i][j], 'B'))
                            count++;
                    }//홀수일때
                    else{
                        if(Objects.equals(arr[i][j], 'W'))
                            count++;
                    }
                }
                else{
                    //짝수일때
                    if(j%2==0){
                        if(Objects.equals(arr[i][j], 'W'))
                            count++;
                    }//홀수일때
                    else{
                        if(Objects.equals(arr[i][j], 'B'))
                            count++;
                    }
                }
            }
        }
        return Math.min(count, 64 - count);
    }
}
