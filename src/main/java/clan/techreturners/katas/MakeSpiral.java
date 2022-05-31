package clan.techreturners.katas;

import java.util.*;

public class MakeSpiral {

    static int[][] getSpiral(int size) {
        int[][] spiral = new int[size][size];
        int startRow = 0, endRow = size - 1, startCol = 0, endCol = size - 1;

        do {
            // First row
            for (int i = startCol; i <= endCol; i++) {
                spiral[startRow][i] = 1;
            }
            if (startCol >= 1) startCol++;
            startRow++;
            // Last column
            for (int i = startRow; i <= endRow; i++) {
                spiral[i][endCol] = 1;
            }
            startRow++;
            endCol--;
            // Last row
            for (int i = endCol; i >= startCol && endRow > size / 2; i--) {
                spiral[endRow][i] = 1;
            }
            endCol--;
            endRow--;
            // First column
            for (int i = endRow; i >= startRow; i--) {
                spiral[i][startCol] = 1;
            }
            endRow--;
            startCol++;
        } while (endRow >= size / 2);

        return spiral;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Please enter the size of the spiral:");

        int size = reader.nextInt();

        System.out.println(Arrays.deepToString(getSpiral(size)).replace("],", "],\n"));
    }
}
