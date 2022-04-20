package clan.techreturners;

import java.util.*;

public class RomanNumeralsEncoder {

    static LinkedHashMap<Integer, String> numToRoman = new LinkedHashMap<>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    static String getRoman(int n) {
        String roman = "";

        while (n > 0) {
            for (int number : numToRoman.keySet())
                while (n >= number) {
                    roman += numToRoman.get(number);
                    n -= number;
                }
        }

        return roman;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number:");

        int number = in.nextInt();

        System.out.println(getRoman(number));
    }
}
