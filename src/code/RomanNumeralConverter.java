package code;

import java.util.ArrayList;

public class RomanNumeralConverter {
	private  ArrayList<Character> symList;
	private ArrayList<Integer> numList;
	
	public RomanNumeralConverter() {
		symList = new ArrayList<Character>();
		symList.add('I');
		symList.add('V');
		symList.add('X');
		symList.add('L');
		symList.add('C');
		symList.add('D');
		symList.add('M');
		
		numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(5);
		numList.add(10);
		numList.add(50);
		numList.add(100);
		numList.add(500);
		numList.add(1000);
	}

	
	public int toNumber(String roman) {
		int result = 0;
		int currentVal = 0;
		int prevVal = 0;
		int consecutiveICounter = 0;
		int consecutiveXCounter = 0;
		int consecutiveCCounter = 0;
		int consecutiveMCounter = 0;
		int repetitionVCounter = 0;
		int repetitionLCounter = 0;
	
		
		for(int i = 0; i < roman.length(); i++) {
			if(symList.indexOf(roman.charAt(i)) > -1) {
				currentVal+=numList.get(symList.indexOf(roman.charAt(i)));
				if(prevVal == currentVal) {
					if(prevVal == 1 ) { 
						consecutiveICounter++;
					} else if (prevVal == 10) {
						consecutiveXCounter++;
					} else if (prevVal == 50) {
						result = -1;
						break;
					} else if (prevVal == 100) {
						consecutiveCCounter++;
					} else if (prevVal == 1000) {
						consecutiveMCounter++;
					} else {
						consecutiveICounter = 0;
						consecutiveXCounter = 0;
						consecutiveCCounter = 0;
						consecutiveMCounter = 0;
					}	
				}	
				if(currentVal == 5) {
					repetitionVCounter++;
				}
			}
			
			if(repetitionVCounter > 1) {
				result = -1;
				break;
			}
			
			//case to handle IV, IX, ...
			if(prevVal < currentVal && prevVal != 0) {
				currentVal = currentVal-prevVal;
				result = result - prevVal;
			} else if(consecutiveICounter == 3 || consecutiveXCounter == 3 || consecutiveCCounter == 3 || consecutiveMCounter == 3) {
				result = -1;
				break;
			}
			
			result += currentVal;
			prevVal = currentVal;
			currentVal = 0;//reset to 0 to calculate next number.
			
		}
	
		return result;
	}
}
