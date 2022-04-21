//Alan Huang CSE114.02 L10 Lab 18
import java.util.Scanner;
public class Lab18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int cols = input.nextInt();
        double[][] array = new double[rows][cols];
        System.out.println("Enter the array");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = input.nextDouble();
            }
        }
        int[] largest = locateLargest(array);
        System.out.println("The location of the largest element is at" + "(" + largest[0] + "," + largest[1] + ")");
        double [][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 maxtric row by row : ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        if(isMarkovMatrix(matrix)){
            System.out.println("The grid is a Markov matrix.");
        }
        else{
            System.out.println("The grid is  NOT a Markov matrix.");
        }
        input.close();
    }
    public static int[] locateLargest(double[][] a){
        int[] x = new int[2];
        x[0] = 0;
		x[1] = 0;
        double max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    x[0] = i;
                    x[1] = j;
                }
            }
        }
        return x;
    }
    public static boolean isMarkovMatrix(double[][] m){
        for(int i = 0; i < m[0].length; i++){
            double sum = 0;
            for(int j = 0; j < m.length; j++){
                double x = m[i][j];
                    if(x < 0){
                    return false;
                }
                sum += x;
            }
            if(sum != 1){
                return false;
            }
        }
        return true;
    }
}
