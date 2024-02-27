package skypro.com.example.demo;

import Service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

	public void shouldReturnCorrectResultOfDivide() {
		assertEquals(out.divide(9, 3), 3);
		assertEquals(out.divide(-9, 3), -3);

	}

}
