//Alan Huang CSE114.02 L10 Lab 13
import java.util.Scanner;
public class Lab13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = input.nextLine();
        System.out.print("Enter a Char : ");
        char ch = input.next().charAt(0);
        System.out.println(count(str,ch));   
        summation();
        input.close();   
    }   
    public static int count(String str, char a){
        int count = 0;
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) == a){
                count++;
            }         
        }
        return count;
    }
    public static void summation(){
        double sum = 0;
        System.out.println("i" + "           " + "m(i)");
        for(int i = 1; i <= 20; i++){
            sum += ((double)i / (i + 1));
            System.out.print(i);
            System.out.printf("           %.4f%n",sum);
        }
    }
}
