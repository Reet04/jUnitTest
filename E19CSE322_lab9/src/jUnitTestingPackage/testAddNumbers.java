package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		JUnitFunction junit = new JUnitFunction();
		int result = junit.addNumbers(100, 200);
		assertEquals (300, result);
	}

}
