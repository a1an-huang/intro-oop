//Alan Huang CSE114.02 L10 HW3 #4
import java.util.Scanner;
public class Hw3problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter matrix1 : ");
        double[][] m1 = new double[3][3];
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1.length; j++)
				m1[i][j] = input.nextDouble();
		}
        System.out.print("Enter matrix2 : ");
		double[][] m2 = new double[3][3];
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2.length; j++)
				m2[i][j] = input.nextDouble();
		}
        System.out.println("Multiplication of the matrices is:  ");
        double [][] m3 = multiplyMatrix(m1,m2);
        for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3.length; j++){
                System.out.printf("%3.1f ", m3[i][j]);
            }
            System.out.println();			
		}
        input.close();
    }
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        double[][] temp = new double[3][3];
        for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				for (int k = 0; k < temp.length; k++) {
					temp[i][j] += a[i][k] * b[k][j];
				}
			}
		}
        return temp;
    }
    
    
}
