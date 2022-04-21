//Alan Huang CSE114.02 L10 Lab 2
import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        //ask user for temp in celsius. convert temp from celsius to fahrenheit with formula. displays the converted value.
        System.out.println("Convert Celsius to Fahrenheit.");
        System.out.print("Enter a degree in Celsius: ");
        double cel = inputNum.nextDouble();
        double fah = (9.0/5) *  cel + 32;
        System.out.println(cel + " Celsius is " + fah + " Fahrenheit.");
        //ask user for water in kilograms, initial temp, and final temp. Use formula to convert inputs to compute energy. displays energy.
        System.out.println("Calculate the energy needed to heat water from an initial temperature to a final temperature.");
        System.out.print("Enter the amount of water in kilograms: ");
        double water = inputNum.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double iTemp = inputNum.nextDouble();
        System.out.print("Enter the final temperature: ");
        double fTemp = inputNum.nextDouble();
        double energy = water * (fTemp - iTemp) * 4184;
        System.out.println("The energy needed is " + energy);
        inputNum.close();
    }
    
}
