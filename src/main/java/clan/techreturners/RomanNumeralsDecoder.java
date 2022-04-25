package clan.techreturners;

import java.util.*;

public class RomanNumeralsDecoder {

    static final String ROMAN_NUMERAL_REGULAR_EXPRESSION = "^M{0,3}(CM|CD|D?C{0,3})?(XC|XL|L?X{0,3})?(IX|IV|V?I{0,3})?$";
    static final String INVALID_ROMAN_NUMERAL = "The input provided is not recognised or supported as a roman numeral";
    static HashMap<Character, Integer> romanToNum = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    static int getNumber(String roman) {
        roman = roman.toUpperCase();

        if (!roman.matches(ROMAN_NUMERAL_REGULAR_EXPRESSION))
            throw new UnsupportedOperationException(INVALID_ROMAN_NUMERAL);

        int number = 0;

        // Replaces the roman numeral its equivalent in our known roman numerals, so they can be added later
        roman = roman.replace("IV", "IIII").replace("IX", "VIIII")
                .replace("XL", "XXXX").replace("XC", "LXXXX")
                .replace("CD", "CCCC").replace("CM", "DCCCC");

        char[] chars = roman.toCharArray();

        for (char c : chars) {
            number += romanToNum.get(c);
        }

        return number;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter a Roman Numeral:");

        String romanNumeral = reader.nextLine();

        System.out.println(getNumber(romanNumeral));
    }
}