package Arrays2D;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        //values
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[0].length; j++) {
                if(arr[i][j]>max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum Element: " +max);
        sc.close();
    }
}
