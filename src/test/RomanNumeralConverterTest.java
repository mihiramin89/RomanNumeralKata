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
	
	@Test 
	public void ItConvertRomanNumeralIX() {
		assertEquals(9,converter.toNumber("IX"));
	}
	
	@Test
	public void ItConvertRomanNumeralX() {
		assertEquals(10,converter.toNumber("X"));
	}
	
	@Test
	public void ItConvertRomanNumeralXL() {
		assertEquals(40,converter.toNumber("XL"));
	}
	
	@Test
	public void ItConvertRomanNumeralC() {
		assertEquals(100,converter.toNumber("C"));
	}
	
	@Test
	public void ItConvertRomanNumeralXC() {
		assertEquals(90,converter.toNumber("XC"));
	}
	
	@Test
	public void ItConvertRomanNumeralD() {
		assertEquals(500,converter.toNumber("D"));
	}
	
	@Test
	public void ItConvertRomanNumeralM() {
		assertEquals(1000,converter.toNumber("M"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralIIII() {
		assertEquals(-1,converter.toNumber("IIII"));
	}
	
	
	@Test
	public void ItFailsToConvertRomanNumeralXXXX() {
		assertEquals(-1,converter.toNumber("XXXX"));
	}
	
	@Test
	public void ItConvertRomanNumeralXXX() {
		assertEquals(30,converter.toNumber("XXX"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralCCCC() {
		assertEquals(-1,converter.toNumber("CCCC"));
	}
	
	@Test
	public void ItConvertRomanNumeralCCC() {
		assertEquals(300,converter.toNumber("CCC"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralMMMM() {
		assertEquals(-1,converter.toNumber("MMMM"));
	}
	
	@Test
	public void ItConvertRomanNumeralMMM() {
		assertEquals(3000,converter.toNumber("MMM"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralWithConsecutiveVs(){
		assertEquals(-1,converter.toNumber("VV"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralWithMultipleVs(){
		assertEquals(-1,converter.toNumber("XIVIV"));
	}
}
