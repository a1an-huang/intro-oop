//Alan Huang CSE114.02 L10 Lab 9
public class Lab9 {
    public static void main(String[] args) {
        /*
        #1
        use the ascii table to find out what the int values of upper case A.
        usedmath.random to generate a random number from 0-1.
        multplied the random number to 26 since that is the amount of letters in the alphabet.
        Add the number to 65 since that is where the uppercase alphabet starts.
        Put a char in front of this randomly generated integer to convert the int to a char.
        */
        System.out.println((char)(65 + Math.random()* 26));
        /* 
        #2
        generate 3 random uppercase letters with the Math.random class.
        generate 4 random numbers between 0-9 with the Math.rondom class.
        put the letters and numbers together.
        print the plate number.
        */
        char firstLetter = (char)(65 + Math.random()* 26);
        char secondLetter = (char)(65 + Math.random()* 26);
        char thirdLetter = (char)(65 + Math.random()* 26);
        int firstNumber = (int)(Math.random()* 10);
        int secondNumber = (int)(Math.random()* 10);
        int thirdNumber = (int)(Math.random()* 10);
        int fourthNumber = (int)(Math.random()* 10);
        System.out.println("" + firstLetter + secondLetter + thirdLetter + firstNumber + secondNumber + thirdNumber + fourthNumber);

    }   
}
