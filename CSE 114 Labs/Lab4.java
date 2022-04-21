    //Alan Huang CSE114.02 L10 Lab 4
import java.util.Scanner;
public class Lab4 {  
    public static void main(String[] args) {
        //creates a new Scanner instance.
        Scanner input = new Scanner(System.in);
        //creates constant variables that contain conversion values.
        final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
        /*
        Ask users to input weight in pound and height in inches. 
        Use Scanner to store inputs into variables. 
        Use constant variables to convert weight to kg and height to m. 
        Computes the bmi using the new weight and height values. 
        Use printf to round to 4 decimal points and print.
        */
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        weight = weight * KILOGRAMS_PER_POUND;
        height = height * METERS_PER_INCH;
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("BMI is %.4f ",bmi);
        /* 
        use \n create a new line, since printf doesn't create a new line.
        Ask users to input driving distance, miles per gallon, and price per gallon
        calculate cost of the total trip. divide distance and miles per gallon for the amount of gallons used. 
        multiply price per gallon for the total cost per trip.
        Use printf to round to 2 decimal places and print.
        */
        System.out.print("\nEnter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter Miles per gallon: ");
        double mpg = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double ppg = input.nextDouble();
        double cost = (distance / mpg) * ppg;
        System.out.printf("The cost of driving is: $%.2f" ,cost);    
        input.close();    
    }    
}
