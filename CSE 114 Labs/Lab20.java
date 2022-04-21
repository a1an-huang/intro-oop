//Alan Huang CSE114.02 L10 Lab 20
import java.util.Scanner;
public class Lab20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle one = new Rectangle(4,40);
        Rectangle two = new Rectangle(3.5,35.9);
        System.out.println("Width: " + one.getWidth());
        System.out.println("Height: " + one.getHeight());
        System.out.println("Area: " + one.getArea());
        System.out.println("Perimeter: " + one.getPerimeter());
        System.out.println("Width: " + two.getWidth());
        System.out.println("Height: " + two.getHeight());
        System.out.println("Area: " + two.getArea());
        System.out.println("Perimeter: " + two.getPerimeter());
        System.out.print("Enter a,b,c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.print("The equation has ");
        if (quadraticEquation.getDiscriminant() < 0){
			System.out.println("no real roots");
        }
		else if (quadraticEquation.getDiscriminant() > 0) {
			System.out.println("two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
		}
		else {
			System.out.println("one root " + (quadraticEquation.getRoot1() > 0 ? quadraticEquation.getRoot1() : quadraticEquation.getRoot2()));
        input.close();
        }
    }
    
}
