//Alan Huang CSE114.02 L10 HW2 #3
import java.util.Scanner;
public class PalidromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String string = input.nextLine();
        if(isPalindrome(string)){
            System.out.println("Input string " + string + " is a palindrome");
        }
        else{
            System.out.println("Input string " + string + " is NOT a palindrome");
        }
        input.close();
    }
    public static boolean isPalindrome(String s) {
        String string = "";
        char ch;
        for (int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            if (ch != ' ') {
                string += Character.toLowerCase(ch);
            }
        }
        for (int i = 0; i < string.length() / 2; i++){
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }    
}
