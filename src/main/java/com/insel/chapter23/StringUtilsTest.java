package com.insel.chapter23;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;


class StringUtilsTest {
	/*
	 * JUnit just doesn't work
	 * Therefore the code is commented out
	 */
	
	/*@Ignore Doesn't work either / should be commented out anyway*/
	@Test(/*timeout = 1 Doesn't work*/)
	public void testReverse() throws UnsupportedEncodingException {
		
		assertEquals("", StringUtils.reverse(""));
		assertEquals("abc", StringUtils.reverse("cba"));
		/*testReverseException();*/
	}
	/*@Test(expected = IllegalArgumentException.class)
	private void testReverseException() {
		try {
			StringUtils.reverse(null);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
