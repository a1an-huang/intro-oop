//Alan Huang CSE114.02 L10 Lab 5
import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
        //creates a new Scanner instance.
        Scanner input = new Scanner(System.in);
        /* 
        Ask user to input temperature, and velocity
        Use Scanner to store inputs ito variables
        Computes the wind velocity using the wind speed formula
        Use print f to print out the value of wind velocity with 5 decimals.
        */
        System.out.print("Enter the temperature in Fahrenheit between -58 Fahrenheit and 41 Fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double velocity = input.nextDouble();
        double wind = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(velocity,.16)) + (0.4275 * temperature * Math.pow(velocity,.16));
        System.out.printf("The wind chill index is %.5f ",wind);
        /* 
        Ask user to input the length of one side
        Use Scanner to store inputs ito variables
        Computes the are of a hexagon with the formula
        Use print f to print out the area of the hexagon with 4 decimals.
        */
        System.out.print("\nEnter the length of the side: ");
        double side = input.nextDouble();
        double area = (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
        System.out.printf("The area of the hexagon is %.4f ",area);
        input.close();
    }    
}
