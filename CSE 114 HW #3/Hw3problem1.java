//Alan Huang CSE114.02 L10 HW3 #1
import java.util.Scanner;
public class Hw3problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 intergers : ");
        int [] list = new int[10];
        for(int i = 0; i < list.length; i++ ){
            list[i] = input.nextInt();
        }
        int[] distinct = eliminateDuplicate(list);
        System.out.print("The distinct intergers are : ");
        for(int i = 0; i < distinct.length; i++){
            System.out.print(distinct[i] + " ");
        }
        input.close();
    }
    public static int[] eliminateDuplicate(int [] list){
        int[] temp = new int[list.length];
        int count = 0;
        for( int i = 0; i < list.length; i++){
            boolean duplicate = false;
            for(int j = 0; j < list.length; j++){
                if(temp[j] == list[i]){
                    duplicate = true;
                }
            }
            if(!duplicate){
                temp[count++] = list[i];
            }
        }
        int[] newList = new int[count];
        for(int i = 0; i < count; i++){
            newList[i] = temp[i];
        } 
        return newList;
    }
}
