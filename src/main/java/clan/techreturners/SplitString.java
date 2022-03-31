package clan.techreturners;

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {

    public static String[] solution(String s) {
        // This regex will split the string in pairs of characters
        String[] pairs = s.split("(?<=\\G..)");

        if (pairs[pairs.length - 1].length() == 1) {
            pairs[pairs.length - 1] += "_";
        }

        return pairs;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a string:");

        String s = reader.nextLine();

        System.out.println("\nResult:");

        System.out.println(Arrays.stream(solution(s)).toList());
    }
}