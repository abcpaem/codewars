package clan.techreturners.katas;

import java.util.Scanner;

public class SimplePigLatin {

    public static String getPig(String str) {
        String[] splitted = str.split("\\s+");
        String pig = new String();

        for (int i = 0; i < splitted.length; i++) {
            pig += splitted[i].matches("[a-zA-Z]+")
                    ? splitted[i].substring(1) + splitted[i].substring(0, 1) + "ay "
                    : splitted[i];
        }

        return pig.trim();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the word to pig:");

        String str = reader.nextLine();

        System.out.println(getPig(str));
    }
}