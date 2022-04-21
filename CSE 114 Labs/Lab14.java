//Alan Huang CSE114.02 L10 Lab 14
import java.util.Scanner;
public class Lab14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter and interger : ");
        int num = input.nextInt();
        displayPattern(num);
        System.out.print("Enter and interger : ");
        int num2 = input.nextInt();
        reverse(num2);
        input.close();
    }
    public static void displayPattern(int n){
        int space = n-1;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < space; j ++ ){
                System.out.print("  ");
            }
            space--;
            for(int k = i; k > 0; k--){
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
    public static void reverse(int number){
        while(number > 0){
            System.out.print(number % 10);
            number = number / 10;
        }

    }
}
