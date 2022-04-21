//Alan Huang 113443530 CSE114.02 HW# problem 1
import java.util.Scanner;
public class HW5Problem1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 of triangle:");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 of triangle:");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 of triangle:");
        double side3 = input.nextDouble();
        System.out.print("Enter color of triangle:");
        String color=input.next();
        System.out.print("Enter whether triangle is filled (yes/no):");
        String choice = input.next();
        choice = choice.toLowerCase();
        boolean filled = false;
        if (choice.equals("yes")){
            filled = true;
        }
        else{
            filled = false;
        }
        Triangle t1 = new Triangle(side1,side2,side3,color,filled);
        System.out.println(t1);
        input.close();
    }
}
