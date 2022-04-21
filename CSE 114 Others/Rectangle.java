public class Rectangle{
   private double w;
   private double h;
   public Rectangle(double width,double height){
      w = width;
      h = height;
   }
   public double getWidth(){
      return w;
   }
    
   public double getHeight(){
      return h;
   }
   public double getArea(){
      return w*h;
   }
     
   public double getPerimeter(){
      return (2*w) + (2*h);
   }
}