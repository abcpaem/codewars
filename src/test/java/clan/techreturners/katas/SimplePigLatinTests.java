package clan.techreturners.katas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplePigLatinTests {
    @Test
    void checkGetPig() {
        // Arrange
        String input = "Peppa likes Latin";

        // Act
        String pigLatin = SimplePigLatin.getPig(input);

        // Assert
        assertEquals("eppaPay ikeslay atinLay", pigLatin);
    }

    @Test
    void checkGetPigWithPunctuationMark() {
        // Arrange
        String input = "This is so cool !";

        // Act
        String pigLatin = SimplePigLatin.getPig(input);

        // Assert
        assertEquals("hisTay siay osay oolcay !", pigLatin);
    }
}
