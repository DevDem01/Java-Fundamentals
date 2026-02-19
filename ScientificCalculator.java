package calculator;

public class ScientificCalculator extends Calculator {

   
    public ScientificCalculator(int num1, int num2) {
        super(num1, num2);
    }

    
    public double squareRoot() {
        if (getNum1() < 0) {
            throw new ArithmeticException("Cannot take square root of a negative number.");
        }
        return Math.sqrt(getNum1());
    }

    
    public double exponent() {
        return Math.pow(getNum1(), getNum2());
    }
}

