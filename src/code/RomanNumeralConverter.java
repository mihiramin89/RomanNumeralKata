package code;

public class RomanNumeralConverter {

	
	public int toNumber(String roman) {
		int result = 0;
		int currentVal = 0;
		int prevVal = 0;
		
		for(int i = 0; i < roman.length(); i++) {
			
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
