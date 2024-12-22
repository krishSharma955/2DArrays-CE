package Arrays2D;
import java.util.*;

public class Largest {
    public  static int largest2D(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                if(matrix[i][j]>max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        //input
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //output
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(largest2D(matrix));
        sc.close();
    }
}
