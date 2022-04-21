//Alan Huang CSE114.02 L10 Lab 6
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        //creates a new Scanner instance.
        Scanner input = new Scanner(System.in);
        /*
        Ask user to input a value for a, b, c.
        use the discriminant formula to find out the amount of roots there are. 
        depending on the value of the discriminant use if / else statements to decide the amount of roots to print.
        uses the quadratic formula to find roots and print.
        */
        System.out.println("Enter 𝑎, 𝑏, 𝑐 ∶ ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);  
		double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
        if(discriminant > 0){  
			System.out.println("The equations has two roots " + r1 + " and " + r2);
        }
        else if(discriminant == 0){  
            System.out.println("The equations has one root  " + r1);
        }
        else{
            System.out.println("The equation has no real roots");     
        }
        /*
        Ask user to input the weight of their package.
        Depending on the weight use if / else statements to decide which message to print.
        prints out the shipping cost depending on the weight.
        */
        System.out.print("Enter the weight of the Package(in pounds): ");
        double weight = input.nextDouble();
        if(weight <= 0){
        System.out.println("Invlaid input");
        }
        else if(0 < weight && weight <= 1){
            System.out.println("The shipping cost is 3.5");
        }
        else if(weight <= 3){
            System.out.println("The shipping cost is 5.5");
        }
        else if(weight <= 10){
            System.out.println("The shipping cost is 8.5");
        }
        else if(weight <= 20){
            System.out.println("The shipping cost is 10.5");
        }
        else{
            System.out.println("The package cannot be shipped.");
        }
        input.close();
    }
}
    

