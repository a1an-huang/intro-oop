//Alan Huang 113443530 CSE114.02 L10 HW4 #2
import java.util.Scanner;
public class HW4Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numerator for the first rational number : ");
        int num1 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number : ");
        int den1 = input.nextInt();
        System.out.print("Enter a numerator for the second rational number : ");
        int num2 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number : ");
        int den2 = input.nextInt();
        Rational r1 = new Rational(num1,den1);
        Rational r2 = new Rational(num2,den2);
        System.out.println("First rational number is: " + r1);
        System.out.println("Second rational number is: " + r2);
        System.out.println("Addition of the rational number is: " + r1.add(r2));
        System.out.println("Subtraction of the rational number is: " + r1.subtract(r2));
        System.out.println("Multiplication of the rational number is: " + r1.multiply(r2));
        System.out.println("Division of the rational number is: " + r1.divide(r2));
        input.close();
    }
    
}
