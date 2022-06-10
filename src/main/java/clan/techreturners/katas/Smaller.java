package clan.techreturners.katas;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Smaller {
    // Implementing a Binary Tree in Java: https://www.baeldung.com/java-binary-tree
    int value;
    int count;
    int same;
    Smaller left;
    Smaller right;

    public Smaller(int value) {
        this.value = value;
        count = 0;
        same = 1;
        left = null;
        right = null;
    }

    public static int[] getSmallerArray(int[] arr) {
        int[] result = new int[arr.length];
        Smaller root = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            root = addRecursive(root, arr[i], i, result, 0);
        }
        return result;
    }

    private static Smaller addRecursive(Smaller current, int value, int index, int[] result, int total) {
        if (current == null) {
            result[index] = total;
            return new Smaller(value);
        }
        if (value < current.value) {
            current.count++;
            current.right = addRecursive(current.right, value, index, result, total);
        } else if (value > current.value) {
            total += current.count + current.same;
            current.left = addRecursive(current.left, value, index, result, total);
        } else { // value already exists
            current.same++;
            result[index] = total + current.count;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the size of the input array:");

        Random ran = new Random();
        int size = reader.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = ran.nextInt(size) + 1;
        }

        System.out.println("\nAuto generated input array:");
        System.out.println(Arrays.toString(input));

        System.out.println("\nSmaller than me array:\n" + Arrays.toString(getSmallerArray(input)));
    }
}
