//Alan Huang 113443530 CSE114.02 L10 
public class Complex {
    private double real;
    private double imaginary;
    public Complex() {
        real = 1;
        imaginary = 1;
    }
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    double getReal() {
        return real;
    }
    double getImaginary() {
        return imaginary;
    }
    public Complex add(Complex c) {
        double r = this.real + c.getReal();
        double i = this.imaginary + c.getImaginary();
        return new Complex(r, i);
    }
    public Complex subtract(Complex c) {
        double r = this.real - c.getReal();
        double i = this.imaginary - c.getImaginary();
        return new Complex(r, i);
    }
    public String toString() {
        return "(" + real + ", " + imaginary + ")";
    }
}