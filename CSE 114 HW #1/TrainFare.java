//Alan Huang CSE114.02 L10 HW1 #3
import java.util.Scanner;
public class TrainFare {
    public static void main(String[] args) {
        /*
        #3      
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Distance: ");
        int distance = input.nextInt();
        final String TRAIN_FARE_TXT = "Output: ";
        final String DOLLAR_SYMBOL = "$";
        boolean isPostive = distance > -1;
        int price = distance * 3;
        int overDisPrice = (50 * 3) + ((distance - 50) * 2);
        int overDis2Price = (50 * 3) + (50 * 2) + ((distance - 100) * 1);
        if(isPostive){
            if(distance < 51){
                System.out.println(TRAIN_FARE_TXT + price + DOLLAR_SYMBOL);
            }
            else if(distance > 50 && distance < 101){
                System.out.println(TRAIN_FARE_TXT + overDisPrice + DOLLAR_SYMBOL) ;
            }
            else{
                System.out.println(TRAIN_FARE_TXT + overDis2Price + DOLLAR_SYMBOL);
            }
        }
        else{
            System.out.println("Please enter a postive distance.");       
        }
        input.close();      
    }    
}
