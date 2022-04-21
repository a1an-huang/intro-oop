//Alan Huang CSE114.02 L10 Lab7
import java.util.Scanner;
public class Lab7 {
    public static void main(String[] args) {
    //creates a new Scanner instance.   
    Scanner input = new Scanner(System.in);
    /*
    #1
    Ask user to input a 3 digit integer
    find the first digit of the number and last digit of the number
    Since it is a 3 digit integer, compare the first and last digit of the integer
    If the first and last digit is equal to each other print that the number is a palidrome
    else print the number is not a palidrome.

    */
    System.out.print("Enter a three-digit integer: ");
    int number = input.nextInt();
    int fDigit = (number % 1000) /100;
    int lDigit = number % 10; 
    if(fDigit == lDigit){
        System.out.println(number + " is a palindrome");
    }
    else{
        System.out.println(number + " is not a palindrome");
    }
    /*
    #2
    Ask the user to input the x and y values of the point on the coordinate
    Use the distance formula to find the distance
    Since the center of the circle is at the orgin I just squared the x and y values without subtracting anything
    since the radius of the circle is 10. The distance within the circle is 10 units away from all angles
    if the distance from the point to the orgin is equal to or less than 10 then then print that the point is within the circle
    else print that the point is not in the circle 
    */
    System.out.print("Enter a point with two coordinates(x,y): ");
    double x = input.nextDouble(); 
    double y = input.nextDouble();
    double distance = Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));
    if(distance == 10 || distance < 10){
        System.out.println("Point " + "(" + x + "," + y + ")" +" is in the circle.");
    }
    else{
        System.out.println("Point " + "(" + x + "," + y + ")" +" is not in the circle.");
    }
    input.close();
    }    
}
