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
		assertEquals(1,converter.toNumber("I"));
	}
	
	@Test
	public void ItConvertRomanNumeralII() {
		assertEquals(2,converter.toNumber("II"));
	}
	
	@Test
	public void ItConvertRomanNumeralIII() {
		assertEquals(3,converter.toNumber("III"));
	}
	
	@Test
	public void ItConvertRomanNumeralIV() {
		assertEquals(4,converter.toNumber("IV"));
	}
	
	@Test
	public void ItConvertRomanNumeralV() {
		assertEquals(5,converter.toNumber("V"));
	}
	
	@Test public void ItConvertRomanNumberalIX() {
		assertEquals(9,converter.toNumber("IX"));
	}
	
	

}
