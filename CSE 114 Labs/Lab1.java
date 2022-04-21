//Alan Huang CSE114.02 L10 Lab 1
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        //Number 1, displays the area and perimeter with the radius of 5.5
        double radius = 5.5;
        System.out.println("The perimeter is " + (Math.PI * 2* radius)); 
        System.out.println("The area is " + (Math.pow(radius, 2)* Math.PI));        
        System.out.println("Enter the starting velocity");
        //Number 2, Uses Scanner to get initial velocity, final velocity, and time from user. Solves and displays Average Acceleration with user input.
        Scanner inputNum = new Scanner(System.in);
        double v0 = inputNum.nextDouble();
        System.out.println("Enter the final velocity");
        double v1 = inputNum.nextDouble();
        System.out.println("Enter the time span");
        double t = inputNum.nextDouble();
        double a = (v1-v0)/t;
        System.out.println("The average acceleration is " + a);
        inputNum.close();
    }            
}
