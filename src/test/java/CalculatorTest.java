import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3), "덧셈 테스트 실패");
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3), "뺄셈 테스트 실패");
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(15,calculator.multiply(3, 5), "곱셈 테스트 실패");
    }

    @Test
    void testDivisionByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "0으로 나누는 경우 예외가 발생해야 합니다.");
    }
}
