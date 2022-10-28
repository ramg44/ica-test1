package com.ica.test1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * 
 * @author ramrushendranathgulla
 * 
 *
 */
class UrinalsTest {

	@Test
	void test1() {
		Urinals urinals = new Urinals();
		String str = "10001";
		int res = urinals.countUrinals(str);
		assertEquals(1, res);
	}

	@Test
	void test2() {
		Urinals urinals = new Urinals();
		String str = "1001";
		int res = urinals.countUrinals(str);
		assertEquals(0, res);
	}

	@Test
	void test3() {
		Urinals urinals = new Urinals();
		String str = "00000";
		int res = urinals.countUrinals(str);
		assertEquals(3, res);
	}

	@Test
	void test4() {
		Urinals urinals = new Urinals();
		String str = "0000";
		int res = urinals.countUrinals(str);
		assertEquals(2, res);
	}

	@Test
	void test5() {
		Urinals urinals = new Urinals();
		String str = "01000";
		int res = urinals.countUrinals(str);
		assertEquals(1, res);
	}

	@Test
	void test6() {
		Urinals urinals = new Urinals();
		String str = "011";
		int res = urinals.countUrinals(str);
		assertEquals(-1, res);
	}

}
