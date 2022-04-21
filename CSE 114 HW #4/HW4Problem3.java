//Alan Huang 113443530 CSE114.02 L10 HW4 #2
public class HW4Problem3 {
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2 , 5.5);
        System.out.println("X value of the 2D Circle : " + c1.getX());
        System.out.println("Y value of the 2D Circle : " + c1.getY());
        System.out.println("Radius of the 2D Circle : " + c1.getRadius());
        System.out.println("Area of the 2D Circle : " + c1.getArea());
        System.out.println("Perimeter of the 2D Circle : " + c1.getPerimeter());
        System.out.println("Does circle1 contain the point (3, 3)? " + c1.contains(3, 3));
        System.out.println("Does circle1 contain the circle centered at (4, 5) with a radius of 10.5? " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Does circle1 overlap the circle centered at (3, 5) with a radius of 2.3? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
    }   
}
