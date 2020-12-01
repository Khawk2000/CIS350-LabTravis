package kmh_cis350;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	@Test
	public void testSub() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.sub(1, 1), 0);
	}
	@Test
	public void testMul() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mul(3, 5), 15);
	}
	@Test
	public void testDiv() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.div(8, 2), 4);
	}
	@Test
	public void testPow() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.pow(3, 4), 81);
	}
	@Test 
	public void testMod() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.mod(10,  3), 1);
	}
}
