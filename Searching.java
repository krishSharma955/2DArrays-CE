package Arrays2D;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int n = arr.length, m = arr[0].length;

        //input
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //matrix
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=m; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        //target
        System.out.println("Enter Target: ");
        int target = sc.nextInt();

        //searching algo
        for(int i = 0; i<=n; i++) {
            for(int j = 0; j<=m; j++) {
                if(arr[i][j]==target) {
                    System.out.println("Found at cell: " + "(" + i + "," + j + ")");
                }
            }
        }
        
        sc.close();
    }
}
