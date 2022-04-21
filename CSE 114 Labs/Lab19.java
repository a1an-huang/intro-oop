//Alan Huang CSE114.02 L10 Lab 19
import java.util.Scanner;
public class Lab19 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        for (int i = 0; i < 100; i++) {
			counts[(int)(Math.random() * 10)]++;
		}
        System.out.println("Count for each number between 0 and 9:");
		for (int i = 0; i < counts.length; i++) {
			System.out.println("number: " + i + " count: " + counts[i]);
		}
        Scanner input = new Scanner(System.in);
        double[][] m = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }
        input.close();
        System.out.println("Sum of the slements in the major diagonal is " + sumMajorDiagonal(m));
    }
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
