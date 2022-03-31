package clan.techreturners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String choice = null;

        while (!"q".equals(choice)) {
            System.out.println("\nChallenges available:\n");
            System.out.println(" 1 - Split string");
            System.out.println(" 2 - Pages in a book");
            System.out.println();
            System.out.println("Which one do you want to run (type 'q' to quit)?:");

            choice = reader.nextLine().trim();
            System.out.println();

            switch (choice) {
                case "1":
                    SplitString.main(null);
                    break;
                case "2":
                    PagesInABook.main(null);
                    break;
            }
        }
    }
}
