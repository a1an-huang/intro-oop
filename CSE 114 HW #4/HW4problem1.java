//Alan Huang 113443530 CSE114.02 L10 HW4 #1
import java.util.Scanner;
public class HW4problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the real part of the first complex number : ");
        int r1 = input.nextInt();
        System.out.print("Enter the imaginary part of the first complex number : ");
        int i1 = input.nextInt();
        System.out.print("Enter the real part of the second complex number : ");
        int r2 = input.nextInt();
        System.out.print("Enter the imaginary part of the second complex number : ");
        int i2 = input.nextInt();
        Complex c1 = new Complex(r1,i1);
        Complex c2 = new Complex(r2,i2);
        System.out.println("First Complex Number :" + c1);
        System.out.println("Second Complex Number :" + c2);
        System.out.println("Addition of complex numbers is : " + c1.add(c2));
        System.out.println("Subtraction of complex numbers is : " + c1.subtract(c2));
        input.close();
    }
}
