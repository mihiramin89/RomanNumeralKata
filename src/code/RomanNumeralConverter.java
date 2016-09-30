package code;

import java.util.ArrayList;

public class RomanNumeralConverter {
	private  ArrayList<String> symList;
	private ArrayList<Integer> numList;
	
	public RomanNumeralConverter() {
		symList = new ArrayList<String>();
		symList.add("I");
		symList.add("V");
		symList.add("X");
		symList.add("L");
		
		numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(5);
		numList.add(10);
		numList.add(50);
	}

	
	public int toNumber(String roman) {
		int result = 0;
		int currentVal = 0;
		int prevVal = 0;
	
		
		for(int i = 0; i < roman.length(); i++) {
//			
//			if(symList.indexOf(roman.substring(i, i)) > 0) {
//				currentVal+=numList.get(symList.indexOf(roman.substring(i, i)));
//			}
			if(roman.charAt(i) == 'D') {
				currentVal+=500;
			}
			if(roman.charAt(i) == 'C') {
				currentVal+=100;
			}
			if(roman.charAt(i) == 'L') {
				currentVal+=50;
			}
			if(roman.charAt(i) == 'X') {
				currentVal+=10;
			}
			if(roman.charAt(i) == 'V')
			{
				currentVal+=5;
			}
			if(roman.charAt(i) =='I')
			{
				currentVal++;
			}
			//case to handle IV, IX, ...
			if(prevVal < currentVal && prevVal != 0) {
				currentVal = currentVal-prevVal;
				result = result - prevVal;
			}
			
			result += currentVal;
			prevVal = currentVal;
			currentVal = 0;//reset to 0 to calculate next number.
			
		}
	
		return result;
	}
}
