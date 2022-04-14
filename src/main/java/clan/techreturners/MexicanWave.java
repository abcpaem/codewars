package clan.techreturners;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MexicanWave {

    public static String[] getWave(String str) {
        List<String> wave = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char[] waveChars = str.toCharArray();

            waveChars[i] = Character.toUpperCase(waveChars[i]);
            wave.add(String.valueOf(waveChars));
        }

        wave.removeIf(x -> x.contains(str));

        return wave.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the word to wave:");

        String wave = reader.nextLine();

        System.out.println((Arrays.stream(getWave(wave)).toList()));
    }
}