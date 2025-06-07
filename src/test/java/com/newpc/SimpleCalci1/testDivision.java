package com.newpc.SimpleCalci1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.newpc.SimpleCalci1.MySimpleCalci;

public class testDivision {

	@Test
	public void test() {
		MySimpleCalci c = new MySimpleCalci();
		assertEquals(3.142856f, c.division(22,7), 0.000002f);
	}

}
