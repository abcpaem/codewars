package clan.techreturners.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SmallerTests {
    @Test
    void checkSmaller() {
        // Arrange
        int[] input = new int[]{5, 4, 7, 9, 2, 4, 4, 5, 6};
        int[] expectedArray = new int[]{4, 1, 5, 5, 0, 0, 0, 0, 0};

        // Act
        int[] smallerArray = Smaller.getSmallerArray(input);

        // Arrange
        assertArrayEquals(expectedArray, smallerArray);
    }
}
