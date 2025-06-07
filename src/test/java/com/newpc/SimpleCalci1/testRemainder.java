package com.newpc.SimpleCalci1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.newpc.SimpleCalci1.MySimpleCalci;

public class testRemainder {

	@Test
	public void test() {
		MySimpleCalci c = new MySimpleCalci();
		int result = c.remainder(13,11);
		assertEquals(2, result);
	}

}
