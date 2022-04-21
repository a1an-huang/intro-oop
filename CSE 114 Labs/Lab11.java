//Alan Huang CSE114.02 L10 Lab 11
import java.util.Scanner;
public class Lab11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        #1
        */
        System.out.print("Enter the phone number : ");
        String number = input.nextLine();
        while(number.length() != 10){
            System.out.print("Please enter a 10-digit phone number : ");
            number = input.nextLine();
        }
            System.out.println("Formatted phone number : " + "(" + number.substring(0,3) + ")" + number.substring(3,6) + "-" + number.substring(6,10));
        /*
        #12
        */
        System.out.print("Enter a SSN : ");
        String ssn = input.nextLine();
        boolean isSsn = (ssn.length() == 11) && (ssn.charAt(3) == '-') && ssn.charAt(6) == '-' && Character.isDigit(ssn.charAt(0)) && Character.isDigit(ssn.charAt(1)) && Character.isDigit(ssn.charAt(2)) && Character.isDigit(ssn.charAt(4)) && Character.isDigit(ssn.charAt(5)) && Character.isDigit(ssn.charAt(7)) && Character.isDigit(ssn.charAt(8)) && Character.isDigit(ssn.charAt(9)) && Character.isDigit(ssn.charAt(10));
        if(isSsn){
            System.out.print(ssn + " is a valid social security number");
        }
        else{
            System.out.println(ssn + " is an invalid social security number");
        }
        input.close();
    }
    
}
