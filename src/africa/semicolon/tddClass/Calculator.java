package africa.semicolon.tddClass;

public class Calculator{
    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {

        return Math.abs(firstNumber - secondNumber);
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            return 0.0;
        }
        return dividend / divisor;
    }
}
