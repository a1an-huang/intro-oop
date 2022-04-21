//Alan Huang CSE114.02 L10 HW2 #2
import java.util.Scanner;
public class BinaryScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        2
        */
        System.out.print("Enter the word: ");
        String word = input.nextLine();
        int counter = 0;
        boolean isValid = false;
        boolean notBinary = false;
        for(int i = 0; i < word.length(); i++){  
            if(word.charAt(i) != '0' && word.charAt(i) != '1'){       
                notBinary = true;
            } 
            if(word.charAt(i) == '1'){
                counter++;
                if(counter >= 3){
                    isValid = true;
                }
            }
            else{
                counter = 0;
            }
        }
        if(notBinary){
            System.out.println("The input word is not a valid binary number");
        }
        else if(isValid){
            System.out.println("The binary word is accepted.");
        }
        else{
            System.out.println("The binary word is rejected.");
        }
        input.close();
    }    
}
