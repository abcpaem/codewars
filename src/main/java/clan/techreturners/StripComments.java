package clan.techreturners;

import java.io.BufferedInputStream;
import java.util.*;

public class StripComments {

    static String getStrip(String text, String[] commentSymbols) {
        String[] lines = text.split("\n");

        for (String symbol : commentSymbols) {
            for (int i = 0; i < lines.length; i++) {
                lines[i] = lines[i].contains(symbol) ? lines[i].substring(0, lines[i].indexOf(symbol)) : lines[i];
                // Removes only trailing whitespaces
                lines[i] = lines[i].replaceFirst("\\s++$", "");
            }
        }

        return String.join("\n", lines);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the text with comment markers:");

        String string = "";

        while (reader.hasNextLine()) {
            String input = reader.nextLine();
            if (input == null || input.trim().isEmpty()) {
                break;
            }
            string += input + "\n";
        }

        System.out.println("Enter comment markers delimited by comma (e.g. #,!):");

        String[] markers = reader.nextLine().split(",");

        System.out.println("\nResult:");

        System.out.println(getStrip(string, markers));
    }
}