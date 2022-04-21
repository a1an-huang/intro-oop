//Alan Huang CSE114.02 L10 HW2 #4
import java.util.Scanner;
public class Anagram {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String first = input.nextLine();
        System.out.print("Enter the second string: ");
        String second = input.nextLine();
        if(isAnagram(first,second)){
            System.out.println(first + " and " + second + " are anagrams");
        }
        else{
            System.out.println(first + " and " + second + " are NOT anagrams");
        }
        input.close();
    }
    public static int count(String string, char ch){
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static boolean isAnagram(String first, String second){
        char ch;
        first = first.toLowerCase();
        second = second.toLowerCase();
        for (int i = 0; i < first.length(); i++){
            ch = first.charAt(i);
            if (ch != ' ' && count(first, ch) != count(second, ch)){
                return false;
            }
        }
        return true;
    }

}
