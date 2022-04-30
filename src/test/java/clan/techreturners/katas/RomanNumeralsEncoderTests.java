package clan.techreturners.katas;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsEncoderTests {
    @ParameterizedTest(name = "{index}) Arabic number {0} is {1}")
    @CsvSource(delimiterString = "->", textBlock = """
            1 -> I
            2 -> II
            3 -> III
            4 -> IV
            5 -> V
            6 -> VI
            7 -> VII
            8 -> VIII
            9 -> IX
            10 -> X
            40 -> XL
            50 -> L
            90 -> XC
            100 -> C
            400 -> CD
            500 -> D
            900 -> CM
            1000 -> M
            3999 -> MMMCMXCIX
            """)
    void checkGetRomanNumber(int number, String expectedRomanNumeral) {
        assertEquals(expectedRomanNumeral, RomanNumeralsEncoder.getRoman(number));
    }
}
