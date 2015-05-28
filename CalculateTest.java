package cn.edu.tju.nc.test;

import cn.edu.tju.nc.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSum() {
		int z = new Calculate().sum(6, 45);
		assertEquals(51, z);
	}

	@Test
	public void testSub() {
		int z = new Calculate().sub(73, 37);
		assertEquals(36, z);
	}

	@Test
	public void testMul() {
		double z = new Calculate().mul(14, 0.3);
		assertEquals(4.2, z, 0);
	}

	@Test
	public void testDiv() {
		double z = new Calculate().div(8.5, 17);
		assertEquals(0.5, z, 0);
	}

}
