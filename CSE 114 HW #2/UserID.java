//Alan Huang CSE114.02 L10 HW2 #1
import java.util.Scanner;
public class UserID {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        #1
        */
        System.out.print("Enter the user ID: ");
        String userId = input.nextLine();
        int counter = 0;
        for(int i = 0; i < userId.length(); i++){
            if(Character.isDigit(userId.charAt(i))){
                counter++;
            }
        //System.out.println(counter);
        if(counter == 2){
            System.out.println("The input user ID is valid");
        }
        else{
            System.out.println(" The User name is invalid");
        }
        input.close();
        }   
    }
}
