//Alan Huang CSE114.02 L10 Lab 9
import java.util.Scanner;
public class Lab10 {
    public static void main(String[] args) {
        /*
        #1
        */
        int sum = 0;
        for(int i = 0; i< 10; i++){
            sum += (int)(Math.random() * 100); 
        }
        double average = (double)sum / 10 ;
        System.out.println(average);
        /*
        #2
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String fCity = input.nextLine();
        System.out.print("Enter the second city: ");
        String sCity = input.nextLine();
        System.out.print("Enter the third city: ");
        String tCity = input.nextLine();
        String temp = "";
        if (sCity.compareTo(fCity) < 0 && sCity.compareTo(tCity) < 0){
			temp = fCity;
			fCity = sCity;
			sCity = temp;	
		}
		else if (tCity.compareTo(fCity) < 0 && tCity.compareTo(sCity) < 0){
			temp = fCity;
			fCity = tCity;
			tCity = temp;
			
		}
		if (tCity.compareTo(sCity) < 0){
			temp = sCity;
		    sCity = tCity;
			tCity = temp;
		} 
        System.out.println("The three cities in alphabetical order are: " + fCity + ", " + sCity + ", " + tCity);
        input.close();
    }
}
