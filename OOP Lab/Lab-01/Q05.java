
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row1=0,row2=0, col1=0, col2=0;
        System.out.println("Enter Rows and Columns of First Matrix: ");
        
        row1 = input.nextInt();
        col1 = input.nextInt();

        System.out.println("Enter Rows and Columns of Second Matrix: ");
        
        row2 = input.nextInt();
        col2 = input.nextInt();

        if (col1 != row2) {
            System.out.println("Column in one matrix must equal Rows of Other\n");
        }else{

            int[][] matrix1 = new int[row1][col1];

            int[][] matrix2 = new int[row2][col2];

            System.out.println("Enter elements of First matrix: ");
            for (int i = 0; i < row1; i++){
                for (int j = 0; j < col1; j++) {
                    matrix1[i][j] = input.nextInt();
                }
            }

            System.out.println("Enter Elements of Second Matrix: ");
            for (int i = 0; i < row1; i++){
                for (int j = 0; j < col1; j++) {
                    matrix2[i][j] = input.nextInt();
                }
            }

            int[][] result = new int[row1][col2];

            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < col1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }


            System.out.println("Result: ");
            for (int i = 0; i < row1; i++){
                for (int j = 0; j < col1; j++) {
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }

        }
    }
}
