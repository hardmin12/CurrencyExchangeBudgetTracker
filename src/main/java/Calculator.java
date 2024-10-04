
public class Calculator {

    // plus Method
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // minus method
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    //곱셈 method
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    //나눗셈 method
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return num1 /num2;
    }

}
