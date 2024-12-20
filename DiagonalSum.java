package Arrays2D;

public class DiagonalSum {
    public static int diaSum(int arr[][]) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            sum += arr[i][i];
            if(i!=arr.length-i-1) {
                sum += arr[i][arr.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {4,5,6,},
                       {7,8,9}};
        System.out.println(diaSum(arr));
    }
}

