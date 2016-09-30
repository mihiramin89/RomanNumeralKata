package code;

public class RomanNumeralConverter {

	public int toRoman(String roman) {
		int result = 0;
		for(int i = 0; i < roman.length(); i++) {
			result++;
		}
	
		return result;
	}
}
