package clan.techreturners.katas;

import java.util.Scanner;

public class PagesInABook {

    public static int getPages(int summary) {
        /* pagePeppa is the number of pages that have as many digits as pagePeppa's string length,
           I was unable to find a proper name, so I asked my kid to name this variable that also has alliteration xD
           Example:
            Pages from 1 to 9 have 1 digit
            Pages from 10 to 99 have 2 digits
            Pages from 100 to 999 have 3 digits
            and go on...
         */
        int pagePeppa = 9;
        int numPages = 0;

        while (summary > 0) {
            for (int i = 1; i <= pagePeppa; i++) {
                numPages++;
                summary -= String.valueOf(pagePeppa).length();

                if (summary == 0) break;
            }

            pagePeppa *= 10;
        }

        return numPages;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter book summary:");

        int summary = reader.nextInt();

        System.out.println("\nResult:");

        System.out.println(getPages(summary));
    }
}