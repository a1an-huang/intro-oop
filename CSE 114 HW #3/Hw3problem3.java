//Alan Huang CSE114.02 L10 HW3 #3
import java.util.Scanner;
public class Hw3problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] list = new String[10];
        System.out.print("Enter 10 Strings : ");
        for(int i = 0; i < list.length; i++){
            list[i] = input.nextLine();
        }
        sort(list);
        input.close();
    }
    public static void sort(String[] x){
        String temp;
        for(int i = 0; i < x.length; i++){
            for(int j = 0;j < x.length; j++){
                if(x[j].compareTo(x[i]) > 0){
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;

                }
            }
        }
        for(int k = 0; k < x.length; k++){
            System.out.print(x[k] + " ");
        }
    }
    
}
