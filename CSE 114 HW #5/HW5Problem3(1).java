//Alan Huang 113443530 CSE114.02 HW# problem 3
import java.util.ArrayList;
import java.util.Scanner;

public class HW5Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input string: ");
        String string = input.nextLine();
        ArrayList<Character> list = toCharacterArray(string);
        System.out.print("Elements of the character array list: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        input.close();
    }

    public static ArrayList<Character> toCharacterArray(String string) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (char ch : string.toCharArray()) {
            list.add(ch);
        }
        return list;
    }
}