package clan.techreturners.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SnailSortTests {
    @Test
    void checkSnailSort() {
        // Arrange
        int size = 3;
        int[] expectedSort = new int[]{1, 2, 3, 6, 9, 8, 7, 4, 5};

        // Act
        int[] snailSort = SnailSort.sort(size);

        // Arrange
        assertArrayEquals(expectedSort, snailSort);
    }
}
