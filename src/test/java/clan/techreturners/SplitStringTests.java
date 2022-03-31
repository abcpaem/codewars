package clan.techreturners;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitStringTests {
    @Test
    void checkSolution() {
        // Arrange
        String input = "mine";
        String[] expectedResult = new String[]{"mi", "ne"};

        // Act
        String[] result = SplitString.solution(input);

        // Assert
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void checkSolutionWhenLastLetterIsSingle() {
        // Arrange
        String input = "yours";
        String[] expectedResult = new String[]{"yo", "ur", "s_"};

        // Act
        String[] result = SplitString.solution(input);

        // Assert
        assertArrayEquals(expectedResult, result);
    }
}
