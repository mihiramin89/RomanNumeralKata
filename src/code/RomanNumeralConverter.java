package code;

public class RomanNumeralConverter {

	public int toRoman(String roman) {
		int result = 0;
		if(roman.equals("I")) {
			result += 1;
		}else if (roman.equals("II")) {
			result+=2;
		}
		return result;
	}
}
