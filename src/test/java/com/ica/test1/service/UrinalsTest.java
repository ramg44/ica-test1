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

	

}
