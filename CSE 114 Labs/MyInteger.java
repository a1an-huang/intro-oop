//Alan Huang CSE114.02 L10 Lab 22
public class MyInteger{
    private int value; 
    public MyInteger(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public boolean isEven(){
        return (value % 2) == 0;
    }
    public boolean isOdd(){
        return (value % 2) == 1;
    }
    public boolean isPrime(){
        if (value == 1 || value == 2){
            return true;
        }
        else{
            for (int i = 2; i < value; i++){
                if (i % value == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isEven(MyInteger myInt){
        return myInt.isEven();
    }
    public static boolean isOdd(MyInteger myInt){
        return myInt.isOdd();
    }
    public static boolean isPrime(MyInteger myInt){
        return myInt.isPrime();
    }
    public boolean equals(int num) {
        if(num == value){
            return true;
        }
        return false;
    }
    public boolean equals(MyInteger myInt) {
        if(myInt.value == this.value){
            return true;
        }
        return false;
    }
}