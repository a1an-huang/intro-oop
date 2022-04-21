//Alan Huang CSE114.02 L10 Lab 21
import java.util.Scanner;
public class Lab21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RegularPolygon p1 = new RegularPolygon();
        RegularPolygon p2 = new RegularPolygon(6, 4);
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("Default Polygon Perimeter : " +  p1.getPerimeter() + " Default Polygon Area : " + p1.getArea());
        System.out.println("Polygon 2 Perimeter : " +  p2.getPerimeter() + " Polygon 2 Area : " + p2.getArea());
        System.out.println("Polygon 3 Perimeter : " +  p3.getPerimeter() + " Polygon 3 Area : " + p3.getArea());
        System.out.print("Enter a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation l1 = new LinearEquation(a, b, c, d, e, f);
        if(l1.isSolvable()){
            System.out.println("X is " + l1.getX() + " Y is " + l1.getY());
        }
        else{
            System.out.println("The equation has no solutions.");
        }
        input.close();
    }
}
