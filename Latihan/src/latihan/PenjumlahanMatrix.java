package latihan;
import java.util.Scanner;

public class PenjumlahanMatrix {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.print("input row of matrix: ");
        int row = scan.nextInt();
        
        System.out.print("input column of matrix: ");
        int column = scan.nextInt();
        
        System.out.println("matrix A:");
        int[][] matrixA = createMatrix(row, column);
        
        System.out.println();
        
        System.out.println("matrix B:");
        int[][] matrixB = createMatrix(row, column);
        
        System.out.println("result: ");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                int total = matrixA[i][j] + matrixB[i][j];
                System.out.print(total + " ");
            }
            System.out.println();
        }
    }
    
    static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("row: " + i + " column: " + j + " : ");
                matrix[i][j] = scan.nextInt();
            }
        }
    return matrix;
    }
}
