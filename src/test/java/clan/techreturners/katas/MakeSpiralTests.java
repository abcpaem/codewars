package clan.techreturners.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MakeSpiralTests {
    @Test
    void checkMakeSpiral() {
        // Arrange
        int size = 5;
        int[][] expectedSpiral = new int[][]{{1, 1, 1, 1, 1}, {0, 0, 0, 0, 1}, {1, 1, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}};

        // Act
        int[][] spiral = MakeSpiral.getSpiral(size);

        // Arrange
        assertArrayEquals(expectedSpiral, spiral);
    }
}
