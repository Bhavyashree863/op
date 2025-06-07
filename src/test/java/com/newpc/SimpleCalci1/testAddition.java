package com.newpc.SimpleCalci1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.newpc.SimpleCalci1.MySimpleCalci;

public class testAddition {

	@Test
	public void test() {
		MySimpleCalci c = new MySimpleCalci();
		int result = c.addition(11,13);
		assertEquals(24, result);
	}

}
