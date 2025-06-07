package com.newpc.SimpleCalci1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.newpc.SimpleCalci1.MySimpleCalci;

public class testSubtraction {

	@Test
	public void test() {
		MySimpleCalci c = new MySimpleCalci();
		int result = c.subtraction(11,13);
		assertEquals(-2, result);
	}

}
