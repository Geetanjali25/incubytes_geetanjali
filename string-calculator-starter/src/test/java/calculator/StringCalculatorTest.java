package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

	StringCalculator C = new StringCalculator();

	@Test
	public void test1_1(){
		try {
		//Empty String test case
		assertEquals(0, C.Add(""));
		}catch(Exception e) {
    		//e.printStackTrace();
    	}
	}
}
