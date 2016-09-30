package test;

import static org.junit.Assert.*;
import code.RomanNumeralConverter;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralConverterTest {

	private RomanNumeralConverter converter;
	
	@Before
	public void setUp() throws Exception {
		converter = new RomanNumeralConverter();
	}

	@Test
	public void ItConvertRomanNumeralI() {
		assertEquals(1,converter.toRoman("I"));
	}
	
	@Test
	public void ItConvertRomanNumeralII() {
		assertEquals(2,converter.toRoman("II"));
	}

}
