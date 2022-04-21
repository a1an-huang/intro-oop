//Alan Huang CSE114.02 L10 HW1 #2
import java.util.Scanner;
public class VowelScanner {
    public static void main(String[] args) {
        /*
        #2  
        */   
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String userInput = input.nextLine(); 
        char letter = userInput.charAt(0);
        if(Character.isLetter(letter)){
            switch (Character.toString(letter)){
                case "A": case "E": case "I": case "O": case "U": case "a": case "e": case "i": case "o": case "u": 
                System.out.println(userInput + " is a vowel"); 
                break;
				default: 
                System.out.println(userInput + " is a consonant"); 
            }       
        }
        else{
            System.out.println(userInput + " is an invalid input");
        }
        input.close();
    }    
}
