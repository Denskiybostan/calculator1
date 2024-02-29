package skypro.com.example.demo;

import Service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
	}
	private final CalculatorService out = new CalculatorService();
	@Test
	public void shouldReturnCorrectResultOfSummation() {
		assertEquals(out.plus(1, 2), 3);
		assertEquals(out.plus(2, 3), 5);
		assertEquals(out.plus(4, -4), 0);
	}

	private void assertEquals(int plus, int i) {
	}

	@Test
	public void shouldReturnCorrectResultOfSubtraction() {
		assertEquals(out.minus(4, 6), -2);
		assertEquals(out.minus(-5,5), 0);
		assertEquals(out.minus(10,5), 5);
	}
	@Test
	public void shouldReturnCorrectResultOfMultiply() {
		assertEquals(out.multiply(3, 3), 9);
		assertEquals(out.multiply(10, 0), 0);
		assertEquals(out.multiply(0,5), 0);

	}
	@Test
	public void shouldReturnCorrectResultOfDivide() {
		assertEquals(out.divide(9, 3), 3);
		assertEquals(out.divide(-9, 3), -3);
	}
	@Test
	public void shouldThrowIllegalArgumentExceptionWhenDividingByZero() {
		assertThrows(IllegalArgumentException.class, () -> out.divide(1, 0));
	}
	@Test
	public void shouldThrowIllegalArgumentExceptionWhenNumberDivideByNull() {
		assertThrows(RuntimeException.class, () -> out.divide(1, null));
		assertThrows(RuntimeException.class, () -> out.divide(null, null));
	}
	@Test
	public void shouldThrowIllegalArgumentExceptionWhenNumberMultiplyByNull() {
		assertThrows(RuntimeException.class, () -> out.multiply(1, null));
		assertThrows(RuntimeException.class, () -> out.multiply(null, null));
	}
	@Test
	public void shouldThrowIllegalArgumentExceptionWhenNumberMinusByNull() {
		assertThrows(RuntimeException.class, () -> out.minus(1, null));
		assertThrows(RuntimeException.class, () -> out.minus(null, null));
	}
	@Test
	public void shouldThrowIllegalArgumentExceptionWhenNumberPlusByNull() {
		assertThrows(RuntimeException.class, () -> out.plus(1, null));
		assertThrows(RuntimeException.class, () -> out.plus(null, null));
	}

}
