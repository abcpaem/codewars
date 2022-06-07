package clan.techreturners.katas;

import java.util.*;

public class SnailSort {

    static int[] sort(int[][] array) {
        ArrayList<Integer> spiral = new ArrayList<>();
        int startRow = 0, endRow = array.length - 1, startCol = 0, endCol = array.length - 1;

        while (array.length > 0 && spiral.size() < array.length * array.length) {
            // First row
            for (int i = startCol; i <= endCol; i++) {
                spiral.add(array[startRow][i]);
            }
            startRow++;
            // Last column
            for (int i = startRow; i <= endRow; i++) {
                spiral.add(array[i][endCol]);
            }
            endCol--;
            // Last row
            for (int i = endCol; i >= startCol; i--) {
                spiral.add(array[endRow][i]);
            }
            endRow--;
            // First column
            for (int i = endRow; i >= startRow; i--) {
                spiral.add(array[i][startCol]);
            }
            startCol++;
        }

        return spiral.stream().mapToInt(i -> i).toArray();
    }

    static int[] sort(int size) {
        return sort(get2dArray(size));
    }

    static int[][] get2dArray(int size) {
        int value = 1;
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = value++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the size of the array:");

        int size = reader.nextInt();
        int[][] array = get2dArray(size);

        System.out.println("\nGenerated array:");
        System.out.println(Arrays.deepToString(array).replace("],", "],\n"));
        System.out.println("\nSnail sort array:\n" + Arrays.toString(sort(array)));
    }
}
