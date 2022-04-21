//Alan Huang CSE114.02 L10 Lab 3
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        //creates a new Scanner instance.
        Scanner input = new Scanner(System.in);
        //Ask user to enter balance and interest rate. Uses user input to caculate the interest. Displays Interest.
        System.out.println("Enter balance and interest rate (e.g., 3 for 3 %): ");
        double balance = input.nextDouble();
        double intRate = input.nextDouble();
        intRate = intRate / 100;
        double interest = balance * (intRate / 120);
        System.out.println("The interest is " + interest);
        //Ask users to enter x1 and y1. Ask users to enter x2 and y2. Uses user input to caculate the distance between points. Displays distance.
        System.out.println("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double distance =  Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The distance between the two points is " + distance);
        input.close();
    }
    
}
