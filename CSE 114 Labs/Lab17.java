//Alan Huang CSE114.02 L10 Lab 16
import java.util.Scanner;
public class Lab17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int best = 0;
        System.out.print("Enter the number of students : ");
        int x = input.nextInt();
        int [] grades = new int[x];
        System.out.print("Enter the " + x + " scores: ");
        for(int i = 0; i < x; i++){
            grades[i] = input.nextInt();
            if(grades[i] > best){
                best = grades[i];
            }
        }
        char grade;
        for( int i = 0; i < x; i ++){
            if (grades[i] >= best - 10){
                grade = 'A';
            }
            else if(grades[i] >= best - 20){
                grade = 'B';
            }
            else if(grades[i] >= best - 30){
                grade = 'C';
            }
            else if (grades[i] >= best - 40){ 
                grade = 'D';
            }
            else{
                grade = 'F';
            }
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + grade);
        }
        System.out.print("Enter the intergers between 1 and 100 : ");
        int[] z = new int[100];    
        for( int i = 0; i < z.length; i ++) {
             int num = input.nextInt();
             if(num == 0){
                 break;
             }
             else{
                z[i] = num;
             }                
        }
        for(int i = 0; i <= 100; i++){
            int count = 0;
            for(int k = 0; k < z.length;k ++){
                if(z[k] == 0){
                    break;
                }
                if(z[k] == i){
                    count ++;
                }
            }
            if(count != 0 && count > 1){
                System.out.println(i + " occurs " + count + " times");
            }
            else if(count != 0 && count == 1){
                System.out.println(i + " occurs " + count + " time");
            }
        }
        input.close();
    }    
}
