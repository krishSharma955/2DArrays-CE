package Arrays2D;

public class Transpose {
    public static void transpose(int matrix[][]) {
        int tmatrix[][] = new int[matrix.length][matrix[0].length];
        for(int i = 0; i<matrix.length; i++) {
            for(int j = 0; j<matrix[0].length; j++) {
                tmatrix[j][i] = matrix[i][j]; 
            }
        }

        //tmatrix
        for(int i = 0; i<tmatrix.length; i++) {
            for(int j = 0; j<tmatrix[0].length; j++) {
                System.out.print(tmatrix[i][j] +" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                       {4,5,6,},
                       {7,8,9}};
        transpose(matrix);
    }
}
