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
	
	@Test
	public void test1_2() {
		try {
		//Single element and 2 element string test case
		assertEquals(1, C.Add("1"));
		assertEquals(2, C.Add("2"));
		assertEquals(3, C.Add("1,2"));
		assertEquals(5, C.Add("2,3"));
		}catch(Exception e) {
    		//e.printStackTrace();
    	}
	}
	@Test
	public void test2() {
		try {
		//Unknown number of elements
		assertEquals(6, C.Add("1,2,3"));
		assertEquals(10, C.Add("1,2,3,4"));
		assertEquals(14, C.Add("2,3,4,5"));
		assertEquals(42, C.Add("2,4,6,8,10,12"));
		}catch(Exception e) {
    		//e.printStackTrace();
    	}
	}	
}
