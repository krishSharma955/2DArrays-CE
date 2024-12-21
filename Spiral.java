package Arrays2D;
import java.util.Scanner;

public class Spiral {
    public static void spiralMatrix(int matrix[][]) {
        String str = "";
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol) {
            for(int j = startCol; j<=endCol; j++) {
                str += matrix[startRow][j];
            }
            for(int i = startRow+1; i<=endRow; i++) {
                str += matrix[i][endCol];
            }
            for(int j = endCol-1; j>=startCol; j--) {
                if(startRow==endRow) {
                    break;
                }
                str += matrix[endRow][j];
            }
            for(int i = endRow-1; i>=startRow+1; i--) {
                if(startCol==endCol) {
                    break;
                }
                str += matrix[i][startCol];
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        spiralMatrix(matrix);
        sc.close();
    }
}
