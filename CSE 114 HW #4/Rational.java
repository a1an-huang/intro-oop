//Alan Huang 113443530 CSE114.02 L10 
public class Rational {
    private int numerator;
    private int denominator;
    public Rational(){
        numerator = 1;
        denominator = 2;
    }
    public Rational(int numerator, int denominator) {
        int gcd = 1;
        for(int i = 1; i <= numerator && i <= denominator; i++){
            if(numerator % i == 0 && denominator % i == 0)
                gcd = i;
        }
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public Rational add(Rational r) {
        int  num = numerator * r.denominator + r.numerator * denominator;
        int denom = denominator * r.denominator;
        return new Rational(num, denom);
    }
    public Rational subtract(Rational r) {
        int num = numerator * r.denominator - r.numerator * denominator;
        int denom = denominator  * r.denominator;
        return new Rational(num, denom);
    }
    public Rational multiply(Rational r) {
        int num = numerator * r.numerator;
        int denom = denominator * r.denominator;
        return  new Rational(num, denom);
    }
    public Rational divide(Rational r) {
        int num = numerator  * r.denominator;
        int denom = denominator  * r.numerator;
        return new Rational(num, denom);
    }
    public String toString() {
        return  + numerator + "/" + denominator;
    }
}