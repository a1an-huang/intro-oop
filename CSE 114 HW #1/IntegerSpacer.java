//Alan Huang CSE114.02 L10 HW1 #3
import java.util.Scanner;
public class IntegerSpacer {
    public static void main(String[] args) {
        /*
        #4
        */
        Scanner input  = new Scanner(System.in); 
        System.out.print("Enter a positive 5-digit number: ");
        int number = input.nextInt();
        int firstDigit = (number % 100000) / 10000;
        int secondDigit = (number % 10000) / 1000;
        int thirdDigit = (number % 1000)  / 100;
        int fourthDigit = (number % 100) / 10;
        int fifthDigit =  number % 10;
        System.out.println(firstDigit + " "  + secondDigit + " " + thirdDigit + " " + fourthDigit + " " + fifthDigit);
        input.close();   
        /*
        When the program is executed with more than 5 digits it prints the last 5 digits of the integer.
        When the program is executed with less than 5 digit it prints whatever the integer is with spaces between them,
        However what every number it is not printed up to 5 digits is replaced with 0.
        In order to modify my program to ignore the numbers not equal to five digits I will probably use if/else statements 
        to set a range and ignore the numbers that are not within the range.
        */
    }    
}
