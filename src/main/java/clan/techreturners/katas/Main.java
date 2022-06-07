package clan.techreturners.katas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String choice = null;

        while (!"q".equals(choice)) {
            System.out.println("\nChallenges available:\n");
            System.out.println(" 1 - Split string");
            System.out.println(" 2 - Pages in a book");
            System.out.println(" 3 - Simple Pig Latin");
            System.out.println(" 4 - Strip Comments");
            System.out.println(" 5 - Mexican wave");
            System.out.println(" 6 - Roman numerals encoder");
            System.out.println(" 7 - Roman numerals decoder");
            System.out.println(" 8 - Make a spiral");
            System.out.println(" 9 - Snail sort");
            System.out.println();
            System.out.println("Which one do you want to run (type 'q' to quit)?:");

            choice = reader.nextLine().trim();
            System.out.println();

            switch (choice) {
                case "1" -> SplitStrings.main(null);
                case "2" -> PagesInABook.main(null);
                case "3" -> SimplePigLatin.main(null);
                case "4" -> StripComments.main(null);
                case "5" -> MexicanWave.main(null);
                case "6" -> RomanNumeralsEncoder.main(null);
                case "7" -> RomanNumeralsDecoder.main(null);
                case "8" -> MakeSpiral.main(null);
                case "9" -> SnailSort.main(null);
            }
        }
    }
}
