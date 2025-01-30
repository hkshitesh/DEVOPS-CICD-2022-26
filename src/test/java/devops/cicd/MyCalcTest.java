package devops.cicd;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {

	@Test
	public void test() {
		
		MyCalc calc = new MyCalc();
		assertEquals(30, calc.sum(20, 10));
	}

}
