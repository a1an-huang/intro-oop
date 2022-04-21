//Alan Huang CSE114.02 L10 Lab 14
import java.util.Scanner;
public class Lab15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double side = input.nextDouble();
        System.out.println("The area of the pentagon is " + area(side));
        for (int i = 2; i < 1000; i++) {
            if (prime(i) && prime(i + 2)) {
                System.out.println("("+ i  + "," + (i+2) + ")");
            }
        }
        input.close();
    }
    public static double area(double side){
        double area = 0;
        area = (5 * Math.pow(side,2)) / (4 * Math.tan(Math.PI/5));
        return area;
    }
    public static boolean prime(int num){
        for (int i = 2; i <= num / 2; i++) {

            if(num % i == 0){
                return false;
            }
        }
        return true;
    }    
}
