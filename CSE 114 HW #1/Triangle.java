//Alan Huang CSE114.02 L10 HW1 #1
import java.util.Scanner;
public class Triangle{
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);        
        /*
        #1
        */
        System.out.print("Input Side 1: ");
        double side1 = input.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = input.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = input.nextDouble();
        boolean isTriangle = (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 >side2);
        boolean isEquilateral = (side1 == side2) && ( side2== side3);
        boolean isIsosceles = (side1 == side2) || (side2 == side3) || (side3 == side1);
        if(isTriangle){
            if(isEquilateral){
                System.out.println("Output: Equilateral");
            }
            else if(isIsosceles){
                System.out.println("Output: Isosceles");
            }
            else{
                System.out.println("Output: Scalene");
            }
        }
        else{
            System.out.println("Output: Invalid input!");
        }
        input.close();
    }
    

}