package clan.techreturners;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsDecoderTests {
    @ParameterizedTest(name = "{index}) Roman numeral {0} is {1}")
    @CsvSource(delimiterString = "->", textBlock = """
            I    -> 1
            II   -> 2
            III  -> 3
            IV   -> 4
            V    -> 5
            VI   -> 6
            VII  -> 7
            VIII -> 8
            IX   -> 9
            X    -> 10
            XL   -> 40
            L    -> 50
            XC   -> 90
            C    -> 100
            CD   -> 400
            D    -> 500
            CM   -> 900
            M    -> 1000
            MMMCMXCIX -> 3999
            """)
    void checkGetArabicNumber(String romanNumeral, int expectedArabicNumber) {
        assertEquals(expectedArabicNumber, RomanNumeralsDecoder.getNumber(romanNumeral));
    }
}
