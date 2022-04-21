//Alan Huang CSE114.02 L10 Lab 12
public class Lab12 {
    public static void main(String[] args) {
        /*
        #1
        */
        double sum = 0;
        for(double i = 1; i <= 97; i+=2){
            sum += (i / (i + 2));
        }
        System.out.println("Summation : " + sum);
        /* 
        #2
        */
        System.out.print("Perfect numbers : ");
        for(int i = 1;i < 10000; i++){
            int total = 0;
            for(int j = 1; j < i; j++){
                if(i % j == 0){
                    total += j;
                }
             }
            if(total == i){
                System.out.print(total + " ");
            }
        }

    }
    
}
