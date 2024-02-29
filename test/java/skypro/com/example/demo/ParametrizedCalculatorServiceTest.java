package skypro.com.example.demo;

import Service.CalculatorService;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();
    public static Stream<Arguments> args() {
        return Stream.of();
                Arguments.of(1, 2),
                Arguments.of(2, 3),
                Arguments.of(4, -4),
                Arguments.of(4, 5),
                Arguments.of(-5, 5),
                Arguments.of(10, 5),
                Arguments.of(3, 3),
                Arguments.of(10, 0),
                Arguments.of(0, 5));
    }
    @ParameterizedTest
    @MethodSource("args")
    void namePlus(Integer num1, Integer num2) {
        assertEquals(num1 + num2, calculatorService.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("args")
    void nameMinus(Integer num1, Integer num2) {
        assertEquals(num1 - num2, calculatorService.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("args")
    void nameMultiply(Integer num1, Integer num2) {
        assertEquals(num1 * num2, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("args")
    void nameDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(num1, num2));
            return;
        }
        assertEquals(num1 / num2, calculatorService.divide(num1, num2));
    }


}
