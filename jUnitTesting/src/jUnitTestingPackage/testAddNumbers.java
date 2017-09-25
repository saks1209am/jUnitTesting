package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction junit=new jUnitFunction();
		int results=junit.addNumbers(147,247);
		assertEquals(394,results);
	}

}
