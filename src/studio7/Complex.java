public class Complex {

    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        double newReal = this.real + other.real;
        double newImag = this.imag + other.imag;
        return new Complex(newReal, newImag);
    }

    public Complex multiply(Complex other) {
        double newReal = (this.real * other.real) - (this.imag * other.imag);
        double newImag = (this.real * other.imag) + (this.imag * other.real);
        return new Complex(newReal, newImag);
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag >= 0) {
            return real + " + " + imag + "i";
        } else {
            return real + " - " + (-imag) + "i";
        }
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(1, -4);

        Complex sum = c1.add(c2);
        Complex product = c1.multiply(c2);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
    }
}


