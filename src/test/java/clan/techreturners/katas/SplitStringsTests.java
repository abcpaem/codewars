package clan.techreturners.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitStringsTests {
    @Test
    void checkGetStrings() {
        // Arrange
        String input = "mine";
        String[] expectedResult = new String[]{"mi", "ne"};

        // Act
        String[] result = SplitStrings.getStrings(input);

        // Assert
        assertArrayEquals(expectedResult, result);
    }

    @Test
    void checkGetStringsWhenLastLetterIsSingle() {
        // Arrange
        String input = "yours";
        String[] expectedResult = new String[]{"yo", "ur", "s_"};

        // Act
        String[] result = SplitStrings.getStrings(input);

        // Assert
        assertArrayEquals(expectedResult, result);
    }
}
