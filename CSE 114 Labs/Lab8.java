//Alan Huang CSE114.02 L10 Lab8
import java.util.Scanner;
public class Lab8 {
    public static void main(String[] args) {
        //creates a new Scanner instance.  
        Scanner input = new Scanner(System.in);
        /*
        #1
        Ask the user to input the number of side and its length.
        use the Math class to use to create the formula.
        Math.pow to square, Math.tan to use the tan equation, and Math.PI for the exact pi value.
        Print out the area of the polugon with the inputs.
        */
        System.out.print("Enter the number of sides : ");
        double n = input.nextDouble();
        System.out.print("Enter the side length : ");
        double s = input.nextDouble();
        double area  = (n * Math.pow(s,2)) / (4 * Math.tan(Math.PI/n));
        System.out.println("The area of the polygon is " + area);        
        /*
        #2
        use the ascii table to find out what the int values of lower case a is.
        usedmath.random to generate a random number from 0-1.
        multplied the random number to 26 since that is the amount of letters in the alphabet.
        Add the number to 97 since that is where the lowecase alphabet start.
        Put a char in front of this randomly generated integer to convert the int to a char.
        */
        System.out.println((char)(97 + Math.random()* 26));
        input.close();
    }   
}
