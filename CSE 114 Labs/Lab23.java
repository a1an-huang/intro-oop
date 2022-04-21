//Alan Huang CSE114.02 L10 Lab 23
import java.util.Scanner;

public class Lab23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a decimal number : ");
        int decimal = input.nextInt();
        System.out.println("Decimal Number :  " + decimal + " Binary Number : " + dec2Bin(decimal));
        System.out.print("Enter a binary number : ");
        String binary = input2.nextLine();
        System.out.println("Binary Number :  " + binary + " Decimal Number : " + bin2Dec(binary));
        input.close();
        input2.close();
    }
    public static String dec2Bin(int value) {
        String binary = "";
        while (0 < value) { 
            int num = value % 2;   
            binary = num + binary;
            value = value / 2;
        }
        return binary;
    }
    public static int bin2Dec(String binaryString){
        int num = Integer.parseInt(binaryString);
        int decimal = 0;
        int count = 1;
        int temp = num;
        while(temp > 0){
            int last = temp % 10;
            temp /= 10;
            decimal += last * count;
            count *= 2;
        }
        return decimal;
    }
}
