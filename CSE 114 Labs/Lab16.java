//Alan Huang CSE114.02 L10 Lab 16
import java.util.Scanner;
public class Lab16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers : ");
        double[] x = new double[10];
        double mean = 0;
        double deviation = 0;
        for( int i = 0; i < x.length; i++){
            x[i] = input.nextDouble();
        }
        mean = mean(x);
        deviation = deviation(x);
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);
        System.out.print("Enter 10 numbers : ");
        double[] array = new double[10];
        for( int i = 0; i < array.length; i++){
            array[i] = input.nextDouble();
        }
        double[] reverse = reverse(array);
        for( int i = 0; i < array.length; i++){
           System.out.print(reverse[i] + " ,");
        }
        input.close();
        
    }
    public static double mean(double[] x) {
        double sum = 0;
        for(int i = 0; i < x.length; i++){
            sum += x[i];
        }
        return sum / 10;
    }
    public static double deviation(double[] x){
        double mean = mean(x);
        double num = 0;
        for(int i = 0; i < x.length; i++){
            num += Math.pow((x[i] - mean), 2);
        }
        double deviation = Math.sqrt(num/(x.length-1));
        return deviation;      
    }
    public static double[] reverse(double[] x){
        int i = 0;
        int j = x.length -1;
        while(i < j){
            double temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            i++;
            j--;
        }
        return x;
    }
    
    
}
