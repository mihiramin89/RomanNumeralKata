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
	
	@Test
	public void ItFailsToConvertRomanNumeralWithConsecutiveLs(){
		assertEquals(-1,converter.toNumber("LL"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralWithMultipleLs() {
		assertEquals(-1,converter.toNumber("LXL"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralWithConsecutiveDs(){
		assertEquals(-1,converter.toNumber("DD"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralWithMultipleDs() {
		assertEquals(-1,converter.toNumber("DCD"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralThatSubtractsV() {
		assertEquals(-1, converter.toNumber("VX"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralThatSubtractsL() {
		assertEquals(-1, converter.toNumber("LC"));
	}
	
	@Test
	public void ItFailsToConvertRomanNumeralThatSubtractsD() {
		assertEquals(-1, converter.toNumber("DM"));
	}
	
	@Test
	public void ItConvertsRomanNumeralMCMLXXXIX() {
		assertEquals(1989,converter.toNumber("MCMLXXXIX"));
	}
	
	
	//TODO: The '1' symbols ('I', 'X', and 'C') can only be subtracted from the 2 next highest values ('IV' and 'IX', 'XL' and 'XC', 'CD' and 'CM'). 
	//       Only one subtraction can be made per numeral ('XC' is allowed, 'XXC' is not). 
	@Test
	public void ItFailsToConvertSubtractingOneFromRomanNumeralIC() {
		assertEquals(-1,converter.toNumber("IC"));
	}
	
	@Test
	public void ItFailsToConvertSubtractingTenFromRomanNumeralXD() {
		assertEquals(-1,converter.toNumber("XD"));
	}

}
