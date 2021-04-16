package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		JUnitFunction junit = new JUnitFunction();
		String result = junit.addStrings("capstone", "project");
		assertEquals ("capstoneproject", result);
	}

}
