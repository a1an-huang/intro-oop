//Alan Huang 113443530 CSE114.02 L10 HW4 #2
import java.util.Scanner;
public class HW4Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][3];
        System.out.print("Enter a 3-by-3 matrix row by row : ");
        for(int i = 0 ; i < m.length; i++){
            for(int j = 0 ; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }
        double[][] sorted = sortRows(m);
        for(int i = 0 ; i < sorted.length; i++){
            for(int j = 0 ; j < sorted[i].length; j++){
                System.out.print(sorted[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
    public static double[][] sortRows(double[][] m){
        double temp;
        for(int i = 0; i < m.length; i++){
            for(int j = 0;j < m[i].length - 1; j++){
                if(m[i][j] > m[i][j+1]){
                    temp = m[i][j];
                    m[i][j] = m[i][j+1];
                    m[i][j+1] = temp;
                }       
            }               
        }
        return m;
    }
}
